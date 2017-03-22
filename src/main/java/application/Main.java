package application;

import controller.Resolvedor;
import dominio.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabi on 21/03/2017.
 */

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        /*CRIANDO OS HORARIOS*/
        //SEGUNDA
        Horario horario01 = new Horario(1, 7, 00, 7, 50, "seg");
        Horario horario02 = new Horario(2, 8, 00, 8, 50, "seg");
        Horario horario03 = new Horario(3, 9, 00, 9, 50, "seg");
        Horario horario04 = new Horario(4, 10, 00, 10, 50, "seg");
        Horario horario05 = new Horario(5, 11, 00, 11, 50, "seg");

        //TERCA
        Horario horario06 = new Horario(6, 07, 00, 7, 50, "ter");
        Horario horario07 = new Horario(7, 8, 00, 8, 50, "ter");
        Horario horario08 = new Horario(8, 9, 00, 9, 50, "ter");
        Horario horario09 = new Horario(9, 10, 00, 10, 50, "ter");
        Horario horario10 = new Horario(10, 11, 00, 11, 50, "ter");

        //QUARTA
        Horario horario11 = new Horario(11, 7, 00, 7, 50, "qua");
        Horario horario12 = new Horario(12, 8, 00, 8, 50, "qua");
        Horario horario13 = new Horario(13, 9, 00, 9, 50, "qua");
        Horario horario14 = new Horario(14, 10, 00, 10, 50, "qua");
        Horario horario15 = new Horario(15, 11, 00, 11, 50, "qua");

        //QUINTA
        Horario horario16 = new Horario(16, 7, 00, 7, 50, "qui");
        Horario horario17 = new Horario(17, 8, 00, 8, 50, "qui");
        Horario horario18 = new Horario(18, 9, 00, 9, 50, "qui");
        Horario horario19 = new Horario(19, 10, 00, 10, 50, "qui");
        Horario horario20 = new Horario(20, 11, 00, 11, 50, "qui");

        //SEXTA
        Horario horario21 = new Horario(21, 7, 00, 7, 50, "sex");
        Horario horario22 = new Horario(22, 8, 00, 8, 50, "sex");
        Horario horario23 = new Horario(23, 9, 00, 9, 50, "sex");
        Horario horario24 = new Horario(24, 10, 00, 10, 50, "sex");
        Horario horario25 = new Horario(25, 11, 00, 11, 50, "sex");

        List<Horario> lstHorario = new ArrayList<Horario>();
        lstHorario.add(horario01);
        lstHorario.add(horario02);
        lstHorario.add(horario03);
        lstHorario.add(horario04);
        lstHorario.add(horario05);
        lstHorario.add(horario06);
        lstHorario.add(horario07);
        lstHorario.add(horario08);
        lstHorario.add(horario09);
        lstHorario.add(horario10);
        lstHorario.add(horario11);
        lstHorario.add(horario12);
        lstHorario.add(horario13);
        lstHorario.add(horario14);
        lstHorario.add(horario15);
        lstHorario.add(horario16);
        lstHorario.add(horario17);
        lstHorario.add(horario18);
        lstHorario.add(horario19);
        lstHorario.add(horario20);
        lstHorario.add(horario21);
        lstHorario.add(horario22);
        lstHorario.add(horario23);
        lstHorario.add(horario24);
        lstHorario.add(horario25);


        /*CRIANDO AS TURMAS*/
        //PRIMEIRO ANO
        Turma turma01 = new Turma(1, "P01", 1);
        Turma turma02 = new Turma(2, "P02", 2);
        Turma turma03 = new Turma(3, "P03", 3);
        Turma turma04 = new Turma(4, "P04", 4);
        Turma turma05 = new Turma(5, "P05", 5);

        //SEGUNDO ANO
        Turma turma06 = new Turma(6, "S06", 6);
        Turma turma07 = new Turma(7, "S07", 7);
        Turma turma08 = new Turma(8, "S08", 8);
        Turma turma09 = new Turma(9, "S09", 9);

        //TERCEIRO ANO
        Turma turma10 = new Turma(10, "T10", 10);
        Turma turma11 = new Turma(11, "T11", 11);

        List<Turma> lstTurma = new ArrayList<Turma>();
        lstTurma.add(turma01);
        lstTurma.add(turma02);
        lstTurma.add(turma03);
        lstTurma.add(turma04);
        lstTurma.add(turma05);
        lstTurma.add(turma06);
        lstTurma.add(turma07);
        lstTurma.add(turma08);
        lstTurma.add(turma09);
        lstTurma.add(turma10);
        lstTurma.add(turma11);


        /*CRIANDO OS PROFESSORES*/
        Professor professor01 = new Professor("Mat 1");
        Professor professor02 = new Professor("Mat 2");
        Professor professor03 = new Professor("Port 1");
        Professor professor04 = new Professor("Port 2");
        Professor professor05 = new Professor("Geo 1");
        Professor professor06 = new Professor("Geo 2");
        Professor professor07 = new Professor("Fis");
        Professor professor08 = new Professor("Bio");
        Professor professor09 = new Professor("Qui");
        Professor professor10 = new Professor("Art");
        Professor professor11 = new Professor("Ing");
        Professor professor12 = new Professor("Hist");
        Professor professor13 = new Professor("Soc");
        Professor professor14 = new Professor("Edf");
        Professor professor15 = new Professor("Filo");


        /*CRIANDO AS DISCIPLINAS*/
        Disciplina disciplina01 = new Disciplina("Matemática 1", professor01);
        Disciplina disciplina02 = new Disciplina("Matemática 2", professor02);
        Disciplina disciplina03 = new Disciplina("Português 1", professor03);
        Disciplina disciplina04 = new Disciplina("Português 2", professor04);
        Disciplina disciplina05 = new Disciplina("Geografia 1", professor05);
        Disciplina disciplina06 = new Disciplina("Geografia 2", professor06);
        Disciplina disciplina07 = new Disciplina("Física", professor07);
        Disciplina disciplina08 = new Disciplina("Biologia", professor08);
        Disciplina disciplina09 = new Disciplina("Química", professor09);
        Disciplina disciplina10 = new Disciplina("Artes", professor10);
        Disciplina disciplina11 = new Disciplina("Inglês", professor11);
        Disciplina disciplina12 = new Disciplina("História", professor12);
        Disciplina disciplina13 = new Disciplina("Sociologia", professor13);
        Disciplina disciplina14 = new Disciplina("Educação Física", professor14);
        Disciplina disciplina15 = new Disciplina("Filosofia", professor15);


        /*CRIANDO AS ALOCACOES*/
        //Prof Mat 1 deve dar 4 aulas em cada turma de 1-5 e 9
        Alocacao alocacao01 = new Alocacao(disciplina01, turma01);
        Alocacao alocacao02 = new Alocacao(disciplina01, turma01);
        Alocacao alocacao03 = new Alocacao(disciplina01, turma01);
        Alocacao alocacao04 = new Alocacao(disciplina01, turma01);

        Alocacao alocacao05 = new Alocacao(disciplina01, turma02);
        Alocacao alocacao06 = new Alocacao(disciplina01, turma02);
        Alocacao alocacao07 = new Alocacao(disciplina01, turma02);
        Alocacao alocacao08 = new Alocacao(disciplina01, turma02);

        Alocacao alocacao09 = new Alocacao(disciplina01, turma03);
        Alocacao alocacao10 = new Alocacao(disciplina01, turma03);
        Alocacao alocacao11 = new Alocacao(disciplina01, turma03);
        Alocacao alocacao12 = new Alocacao(disciplina01, turma03);

        Alocacao alocacao13 = new Alocacao(disciplina01, turma04);
        Alocacao alocacao14 = new Alocacao(disciplina01, turma04);
        Alocacao alocacao15 = new Alocacao(disciplina01, turma04);
        Alocacao alocacao16 = new Alocacao(disciplina01, turma04);

        Alocacao alocacao17 = new Alocacao(disciplina01, turma05);
        Alocacao alocacao18 = new Alocacao(disciplina01, turma05);
        Alocacao alocacao19 = new Alocacao(disciplina01, turma05);
        Alocacao alocacao20 = new Alocacao(disciplina01, turma05);

        Alocacao alocacao21 = new Alocacao(disciplina01, turma09);
        Alocacao alocacao22 = new Alocacao(disciplina01, turma09);
        Alocacao alocacao23 = new Alocacao(disciplina01, turma09);
        Alocacao alocacao24 = new Alocacao(disciplina01, turma09);


        //Prof Mat 2 deve dar 4 aulas em cada turma de 6-8 e 10-11
        Alocacao alocacao25 = new Alocacao(disciplina02, turma06);
        Alocacao alocacao26 = new Alocacao(disciplina02, turma06);
        Alocacao alocacao27 = new Alocacao(disciplina02, turma06);
        Alocacao alocacao28 = new Alocacao(disciplina02, turma06);

        Alocacao alocacao29 = new Alocacao(disciplina02, turma07);
        Alocacao alocacao30 = new Alocacao(disciplina02, turma07);
        Alocacao alocacao31 = new Alocacao(disciplina02, turma07);
        Alocacao alocacao32 = new Alocacao(disciplina02, turma07);

        Alocacao alocacao33 = new Alocacao(disciplina02, turma08);
        Alocacao alocacao34 = new Alocacao(disciplina02, turma08);
        Alocacao alocacao35 = new Alocacao(disciplina02, turma08);
        Alocacao alocacao36 = new Alocacao(disciplina02, turma08);

        Alocacao alocacao37 = new Alocacao(disciplina02, turma10);
        Alocacao alocacao38 = new Alocacao(disciplina02, turma10);
        Alocacao alocacao39 = new Alocacao(disciplina02, turma10);
        Alocacao alocacao40 = new Alocacao(disciplina02, turma10);

        Alocacao alocacao41 = new Alocacao(disciplina02, turma11);
        Alocacao alocacao42 = new Alocacao(disciplina02, turma11);
        Alocacao alocacao43 = new Alocacao(disciplina02, turma11);
        Alocacao alocacao44 = new Alocacao(disciplina02, turma11);


        //Prof Port 1 deve dar 4 aulas em cada turma de 6-11
        Alocacao alocacao45 = new Alocacao(disciplina03, turma06);
        Alocacao alocacao46 = new Alocacao(disciplina03, turma06);
        Alocacao alocacao47 = new Alocacao(disciplina03, turma06);
        Alocacao alocacao48 = new Alocacao(disciplina03, turma06);

        Alocacao alocacao49 = new Alocacao(disciplina03, turma07);
        Alocacao alocacao50 = new Alocacao(disciplina03, turma07);
        Alocacao alocacao51 = new Alocacao(disciplina03, turma07);
        Alocacao alocacao52 = new Alocacao(disciplina03, turma07);

        Alocacao alocacao53 = new Alocacao(disciplina03, turma08);
        Alocacao alocacao54 = new Alocacao(disciplina03, turma08);
        Alocacao alocacao55 = new Alocacao(disciplina03, turma08);
        Alocacao alocacao56 = new Alocacao(disciplina03, turma08);
        Alocacao alocacao57 = new Alocacao(disciplina03, turma08);

        Alocacao alocacao58 = new Alocacao(disciplina03, turma09);
        Alocacao alocacao59 = new Alocacao(disciplina03, turma09);
        Alocacao alocacao60 = new Alocacao(disciplina03, turma09);
        Alocacao alocacao61 = new Alocacao(disciplina03, turma09);

        Alocacao alocacao62 = new Alocacao(disciplina03, turma10);
        Alocacao alocacao63 = new Alocacao(disciplina03, turma10);
        Alocacao alocacao64 = new Alocacao(disciplina03, turma10);
        Alocacao alocacao65 = new Alocacao(disciplina03, turma10);

        Alocacao alocacao66 = new Alocacao(disciplina03, turma11);
        Alocacao alocacao67 = new Alocacao(disciplina03, turma11);
        Alocacao alocacao68 = new Alocacao(disciplina03, turma11);
        Alocacao alocacao69 = new Alocacao(disciplina03, turma11);

        List<Alocacao> lstAlocacao = new ArrayList<Alocacao>();
        lstAlocacao.add(alocacao01);
        lstAlocacao.add(alocacao02);
        lstAlocacao.add(alocacao03);
        lstAlocacao.add(alocacao04);
        lstAlocacao.add(alocacao05);
        lstAlocacao.add(alocacao06);
        lstAlocacao.add(alocacao07);
        lstAlocacao.add(alocacao08);
        lstAlocacao.add(alocacao09);
        lstAlocacao.add(alocacao10);
        lstAlocacao.add(alocacao11);
        lstAlocacao.add(alocacao12);
        lstAlocacao.add(alocacao13);
        lstAlocacao.add(alocacao14);
        lstAlocacao.add(alocacao15);
        lstAlocacao.add(alocacao16);
        lstAlocacao.add(alocacao17);
        lstAlocacao.add(alocacao18);
        lstAlocacao.add(alocacao19);
        lstAlocacao.add(alocacao20);
        lstAlocacao.add(alocacao21);
        lstAlocacao.add(alocacao22);
        lstAlocacao.add(alocacao23);
        lstAlocacao.add(alocacao24);
        lstAlocacao.add(alocacao25);
        lstAlocacao.add(alocacao26);
        lstAlocacao.add(alocacao27);
        lstAlocacao.add(alocacao28);
        lstAlocacao.add(alocacao29);
        lstAlocacao.add(alocacao30);
        lstAlocacao.add(alocacao31);
        lstAlocacao.add(alocacao32);
        lstAlocacao.add(alocacao33);
        lstAlocacao.add(alocacao34);
        lstAlocacao.add(alocacao35);
        lstAlocacao.add(alocacao36);
        lstAlocacao.add(alocacao37);
        lstAlocacao.add(alocacao38);
        lstAlocacao.add(alocacao39);
        lstAlocacao.add(alocacao40);
        lstAlocacao.add(alocacao41);
        lstAlocacao.add(alocacao42);
        lstAlocacao.add(alocacao43);
        lstAlocacao.add(alocacao44);
        lstAlocacao.add(alocacao45);
        lstAlocacao.add(alocacao46);
        lstAlocacao.add(alocacao47);
        lstAlocacao.add(alocacao48);
        lstAlocacao.add(alocacao49);
        lstAlocacao.add(alocacao50);
        lstAlocacao.add(alocacao51);
        lstAlocacao.add(alocacao52);
        lstAlocacao.add(alocacao53);
        lstAlocacao.add(alocacao54);
        lstAlocacao.add(alocacao55);
        lstAlocacao.add(alocacao56);
        lstAlocacao.add(alocacao57);
        lstAlocacao.add(alocacao58);
        lstAlocacao.add(alocacao59);
        lstAlocacao.add(alocacao60);
        lstAlocacao.add(alocacao61);
        lstAlocacao.add(alocacao62);
        lstAlocacao.add(alocacao63);
        lstAlocacao.add(alocacao64);
        lstAlocacao.add(alocacao65);
        lstAlocacao.add(alocacao66);
        lstAlocacao.add(alocacao67);
        lstAlocacao.add(alocacao68);
        lstAlocacao.add(alocacao69);


        /*RESOLUCAO*/
        AlocacaoHorarioTurma problema = new AlocacaoHorarioTurma(lstAlocacao, lstHorario);
        AlocacaoHorarioTurma solucao = Resolvedor.resolver("solver\\tabuSearch.xml", problema);

        long delay = System.currentTimeMillis() - start;
        System.out.println();
        System.out.println("Demorou " + delay + " milissegundos");

    }
}

