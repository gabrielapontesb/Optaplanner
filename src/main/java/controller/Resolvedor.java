package controller;

import dominio.Alocacao;
import dominio.AlocacaoHorarioTurma;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.*;
import jxl.write.Number;
import org.optaplanner.benchmark.api.PlannerBenchmark;
import org.optaplanner.benchmark.api.PlannerBenchmarkFactory;
import org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScore;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Observer;


public class Resolvedor extends java.util.Observable implements Runnable{

    private static final Logger logger = (Logger) LoggerFactory.getLogger(Resolvedor.class);
    private static AlocacaoHorarioTurma alocacaoHorarioTurma;
    private AlocacaoHorarioTurma novaSolucaoAlocacaoHorarioTurma;
    private boolean terminado = false;

    private Observer listenner;

    public boolean novaSolucao = false;

    private List<Alocacao> solucao;

    public static void benchMark() {
        PlannerBenchmarkFactory plannerBenchmarkFactory = PlannerBenchmarkFactory.createFromXmlResource(
                "solver/benchmark/horariosBenchmarkConfig.xml");
        PlannerBenchmark plannerBenchmark = plannerBenchmarkFactory.buildPlannerBenchmark();
        plannerBenchmark.benchmark();
    }

    public static AlocacaoHorarioTurma resolver(String solverConfig, AlocacaoHorarioTurma problema) {
    	
        SolverFactory sF = SolverFactory.createFromXmlResource(solverConfig);
        Solver solver = sF.buildSolver();
        solver.solve(problema);

        AlocacaoHorarioTurma solucao = (AlocacaoHorarioTurma) solver.getBestSolution();
        logarSolucao(solucao);
        gerarExcel(solucao);
        //printResultSolution(solucao);

        return solucao;
    }

    public static void resolver() {

        Resolvedor resolv = new Resolvedor();
        SolverFactory sF = SolverFactory.createFromXmlResource("solver/heuristics/tabuSearch.xml");
        Solver solver = sF.buildSolver();

        solver.addEventListener(event -> {
            if (event.isEveryProblemFactChangeProcessed()) {
                System.out.println("Encontrou nova solução.");

                resolv.novaSolucaoAlocacaoHorarioTurma = (AlocacaoHorarioTurma) event.getNewBestSolution();
                resolv.novaSolucao = true;
            }
        });

        solver.solve(alocacaoHorarioTurma);

        resolv.novaSolucaoAlocacaoHorarioTurma = (AlocacaoHorarioTurma) solver.getBestSolution();
    }

    public static void logarSolucao(AlocacaoHorarioTurma solucao) {
        HardMediumSoftScore score = solucao.getScore();
        String viabilidade = (score.isFeasible()) ? "Sim": "Nao";
        System.out.println("Melhor score: " + score);
        System.out.println("Solução é viável ? R = " + viabilidade);
        System.out.println();
        solucao.getAlocacoes().forEach(a -> logger.info("Professor = [{}] -> Horário = [{}] -> Turma = [{}]",
                a.getDisciplina().getProfessor().getNome(),
                a.getHorario().getId(),
                a.getTurma().getId()));
    }

    public static void gerarExcel(AlocacaoHorarioTurma solucao){
        try
        {
            List<Alocacao> alocacoes = solucao.getAlocacoes();


            String filename = "GradeHorario.xls";
            WorkbookSettings ws = new WorkbookSettings();
            ws.setLocale(new Locale("pt", "PT"));
            WritableWorkbook workbook = Workbook.createWorkbook(new File(filename), ws);
            WritableSheet s = workbook.createSheet("Grade de Horários", 0);

            //cria excel
            //fonte
            WritableFont wf = new WritableFont(WritableFont.ARIAL,10, WritableFont.BOLD);
            WritableCellFormat cf = new WritableCellFormat(wf);
            cf.setWrap(true);

            //criando as linhas de horarios
            int i = 0;
            for (; i < 25; i++){
                Number n = new Number(0, i+1, i+1);
                s.addCell(n);
            }

            //criando as colunas de turmas
            i = 0;
            for (; i < 11; i++){
                Number n = new Number(i+1, 0, i+1);
                s.addCell(n);
            }

            for (Alocacao a : alocacoes) {

                int horario = a.getHorario().getId();
                int turma = a.getTurma().getId();
                String professor = a.getDisciplina().getProfessor().getNome();

                //TODO: verificacao se a celula esta vazia
                Label l = new Label(turma, horario, professor);
                s.addCell(l);
            }

            workbook.write();
            workbook.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (WriteException e)
        {
            e.printStackTrace();
        }
    }

    /*public static void printResultSolution(AlocacaoHorarioTurma solucao) {
        List<Alocacao> resultadoAlocacoes = solucao.getAlocacoes();

        for(Alocacao resultadoAlocacao : resultadoAlocacoes) {
            if (resultadoAlocacao != null) {
                System.out.println("(" + resultadoAlocacao.getDisciplina().getNome() + ", " +
                        resultadoAlocacao.getDisciplina().getProfessor().getNome() + ") (" +
                        resultadoAlocacao.getHorario().getDia() + " " +
                        resultadoAlocacao.getHorario().getHorainicio() + ":" + resultadoAlocacao.getHorario().getMinutoinicio() + " a " +
                        resultadoAlocacao.getHorario().getHorafim() + ":" + resultadoAlocacao.getHorario().getMinutofim() + ") " +
                        "(" + resultadoAlocacao.getTurma().getNome() + ")");
            }
        }
    }*/

    public int getScore() {
        return 123456;
    }

    public AlocacaoHorarioTurma getAlocacaoHorario() {
        return alocacaoHorarioTurma;
    }

    public void setAlocacaoHorario(AlocacaoHorarioTurma alocacaoHorarioTurma) {
        this.alocacaoHorarioTurma = alocacaoHorarioTurma;
    }

    public Observer getListenner() {
        return listenner;
    }

    public void setListenner(Observer listenner) {
        this.listenner = listenner;
    }

    @Override
    public void run() {
        SolverFactory sF = SolverFactory.createFromXmlResource("solver/heuristics/tabuSearch.xml");
        Solver solver = sF.buildSolver();
        AlocacaoHorarioTurma bestSolution;

        solver.addEventListener(event -> {
            if (event.isEveryProblemFactChangeProcessed()) {
                AlocacaoHorarioTurma newBestSolution;
                System.out.println("Encontrou nova solução.");
                newBestSolution = (AlocacaoHorarioTurma) event.getNewBestSolution();
                logarSolucao(newBestSolution);
                listenner.update(Resolvedor.this, event.getNewBestSolution());
            }
        });

        solver.solve(alocacaoHorarioTurma);
        bestSolution = (AlocacaoHorarioTurma) solver.getBestSolution();
        logarSolucao(bestSolution);
        listenner.update(this, bestSolution);
    }

}
