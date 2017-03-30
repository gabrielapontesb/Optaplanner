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

        Alocacao alocacao57 = new Alocacao(disciplina03, turma09);
        Alocacao alocacao58 = new Alocacao(disciplina03, turma09);
        Alocacao alocacao59 = new Alocacao(disciplina03, turma09);
        Alocacao alocacao60 = new Alocacao(disciplina03, turma09);

        Alocacao alocacao61 = new Alocacao(disciplina03, turma10);
        Alocacao alocacao62 = new Alocacao(disciplina03, turma10);
        Alocacao alocacao63 = new Alocacao(disciplina03, turma10);
        Alocacao alocacao64 = new Alocacao(disciplina03, turma10);

        Alocacao alocacao65 = new Alocacao(disciplina03, turma11);
        Alocacao alocacao66 = new Alocacao(disciplina03, turma11);
        Alocacao alocacao67 = new Alocacao(disciplina03, turma11);
        Alocacao alocacao68 = new Alocacao(disciplina03, turma11);


        //Prof Port 2 deve dar 4 aulas em cada turma de 1 a 5
        Alocacao alocacao69 = new Alocacao(disciplina04, turma01);
        Alocacao alocacao70 = new Alocacao(disciplina04, turma01);
        Alocacao alocacao71 = new Alocacao(disciplina04, turma01);
        Alocacao alocacao72 = new Alocacao(disciplina04, turma01);

        Alocacao alocacao73 = new Alocacao(disciplina04, turma02);
        Alocacao alocacao74 = new Alocacao(disciplina04, turma02);
        Alocacao alocacao75 = new Alocacao(disciplina04, turma02);
        Alocacao alocacao76 = new Alocacao(disciplina04, turma02);

        Alocacao alocacao77 = new Alocacao(disciplina04, turma03);
        Alocacao alocacao78 = new Alocacao(disciplina04, turma03);
        Alocacao alocacao79 = new Alocacao(disciplina04, turma03);
        Alocacao alocacao80 = new Alocacao(disciplina04, turma03);

        Alocacao alocacao81 = new Alocacao(disciplina04, turma04);
        Alocacao alocacao82 = new Alocacao(disciplina04, turma04);
        Alocacao alocacao83 = new Alocacao(disciplina04, turma04);
        Alocacao alocacao84 = new Alocacao(disciplina04, turma04);

        Alocacao alocacao85 = new Alocacao(disciplina04, turma05);
        Alocacao alocacao86 = new Alocacao(disciplina04, turma05);
        Alocacao alocacao87 = new Alocacao(disciplina04, turma05);
        Alocacao alocacao88 = new Alocacao(disciplina04, turma05);


        //Prof Geo 1 deve dar 2 aulas em cada turma de 2 a 4 e 6 a 9
        //e 3 aulas na turma 10 e 11
        Alocacao alocacao89 = new Alocacao(disciplina05, turma02);
        Alocacao alocacao90 = new Alocacao(disciplina05, turma02);

        Alocacao alocacao91 = new Alocacao(disciplina05, turma03);
        Alocacao alocacao92 = new Alocacao(disciplina05, turma03);

        Alocacao alocacao93 = new Alocacao(disciplina05, turma04);
        Alocacao alocacao94 = new Alocacao(disciplina05, turma04);

        Alocacao alocacao95 = new Alocacao(disciplina05, turma06);
        Alocacao alocacao96 = new Alocacao(disciplina05, turma06);

        Alocacao alocacao97 = new Alocacao(disciplina05, turma07);
        Alocacao alocacao98 = new Alocacao(disciplina05, turma07);

        Alocacao alocacao99 = new Alocacao(disciplina05, turma08);
        Alocacao alocacao100 = new Alocacao(disciplina05, turma08);

        Alocacao alocacao101 = new Alocacao(disciplina05, turma09);
        Alocacao alocacao102 = new Alocacao(disciplina05, turma09);

        Alocacao alocacao103 = new Alocacao(disciplina05, turma10);
        Alocacao alocacao104 = new Alocacao(disciplina05, turma10);
        Alocacao alocacao105 = new Alocacao(disciplina05, turma10);

        Alocacao alocacao106 = new Alocacao(disciplina05, turma11);
        Alocacao alocacao107 = new Alocacao(disciplina05, turma11);
        Alocacao alocacao108 = new Alocacao(disciplina05, turma11);

        //Prof Geo 2 deve dar 2 aulas em cada turma de 1 a 5
        //e 1 aulas na turma 10 e 11
        Alocacao alocacao109 = new Alocacao(disciplina06, turma01);
        Alocacao alocacao110 = new Alocacao(disciplina06, turma01);

        Alocacao alocacao111 = new Alocacao(disciplina06, turma02);
        Alocacao alocacao112 = new Alocacao(disciplina06, turma02);

        Alocacao alocacao113 = new Alocacao(disciplina06, turma03);
        Alocacao alocacao114 = new Alocacao(disciplina06, turma03);

        Alocacao alocacao115 = new Alocacao(disciplina06, turma04);
        Alocacao alocacao116 = new Alocacao(disciplina06, turma04);

        Alocacao alocacao117 = new Alocacao(disciplina06, turma05);
        Alocacao alocacao118 = new Alocacao(disciplina06, turma05);


        //Prof Fis deve dar 2 aulas em cada turma de 1 a 11
        Alocacao alocacao119 = new Alocacao(disciplina07, turma01);
        Alocacao alocacao120 = new Alocacao(disciplina07, turma01);

        Alocacao alocacao121 = new Alocacao(disciplina07, turma02);
        Alocacao alocacao122 = new Alocacao(disciplina07, turma02);

        Alocacao alocacao123 = new Alocacao(disciplina07, turma03);
        Alocacao alocacao124 = new Alocacao(disciplina07, turma03);

        Alocacao alocacao125 = new Alocacao(disciplina07, turma04);
        Alocacao alocacao126 = new Alocacao(disciplina07, turma04);

        Alocacao alocacao127 = new Alocacao(disciplina07, turma05);
        Alocacao alocacao128 = new Alocacao(disciplina07, turma05);

        Alocacao alocacao129 = new Alocacao(disciplina07, turma06);
        Alocacao alocacao130 = new Alocacao(disciplina07, turma06);

        Alocacao alocacao131 = new Alocacao(disciplina07, turma07);
        Alocacao alocacao132 = new Alocacao(disciplina07, turma07);

        Alocacao alocacao133 = new Alocacao(disciplina07, turma08);
        Alocacao alocacao134 = new Alocacao(disciplina07, turma08);

        Alocacao alocacao135 = new Alocacao(disciplina07, turma09);
        Alocacao alocacao136 = new Alocacao(disciplina07, turma09);

        Alocacao alocacao137 = new Alocacao(disciplina07, turma10);
        Alocacao alocacao138 = new Alocacao(disciplina07, turma10);

        Alocacao alocacao139 = new Alocacao(disciplina07, turma11);
        Alocacao alocacao140 = new Alocacao(disciplina07, turma11);


        //Prof Bio deve dar 2 aulas em cada turma de 1 a 11
        Alocacao alocacao141 = new Alocacao(disciplina08, turma01);
        Alocacao alocacao142 = new Alocacao(disciplina08, turma01);

        Alocacao alocacao143 = new Alocacao(disciplina08, turma02);
        Alocacao alocacao144 = new Alocacao(disciplina08, turma02);

        Alocacao alocacao145 = new Alocacao(disciplina08, turma03);
        Alocacao alocacao146 = new Alocacao(disciplina08, turma03);

        Alocacao alocacao147 = new Alocacao(disciplina08, turma04);
        Alocacao alocacao148 = new Alocacao(disciplina08, turma04);

        Alocacao alocacao149 = new Alocacao(disciplina08, turma05);
        Alocacao alocacao150 = new Alocacao(disciplina08, turma05);

        Alocacao alocacao151 = new Alocacao(disciplina08, turma06);
        Alocacao alocacao152 = new Alocacao(disciplina08, turma06);

        Alocacao alocacao153 = new Alocacao(disciplina08, turma07);
        Alocacao alocacao154 = new Alocacao(disciplina08, turma07);

        Alocacao alocacao155 = new Alocacao(disciplina08, turma08);
        Alocacao alocacao156 = new Alocacao(disciplina08, turma08);

        Alocacao alocacao157 = new Alocacao(disciplina08, turma09);
        Alocacao alocacao158 = new Alocacao(disciplina08, turma09);

        Alocacao alocacao159 = new Alocacao(disciplina08, turma10);
        Alocacao alocacao160 = new Alocacao(disciplina08, turma10);

        Alocacao alocacao161 = new Alocacao(disciplina08, turma11);
        Alocacao alocacao162 = new Alocacao(disciplina08, turma11);


        //Prof Quim deve dar 2 aulas em cada turma de 1 a 11
        Alocacao alocacao163 = new Alocacao(disciplina09, turma01);
        Alocacao alocacao164 = new Alocacao(disciplina09, turma01);

        Alocacao alocacao165 = new Alocacao(disciplina09, turma02);
        Alocacao alocacao166 = new Alocacao(disciplina09, turma02);

        Alocacao alocacao167 = new Alocacao(disciplina09, turma03);
        Alocacao alocacao168 = new Alocacao(disciplina09, turma03);

        Alocacao alocacao169 = new Alocacao(disciplina09, turma04);
        Alocacao alocacao170 = new Alocacao(disciplina09, turma04);

        Alocacao alocacao171 = new Alocacao(disciplina09, turma05);
        Alocacao alocacao172 = new Alocacao(disciplina09, turma05);

        Alocacao alocacao173 = new Alocacao(disciplina09, turma06);
        Alocacao alocacao174 = new Alocacao(disciplina09, turma06);

        Alocacao alocacao175 = new Alocacao(disciplina09, turma07);
        Alocacao alocacao176 = new Alocacao(disciplina09, turma07);

        Alocacao alocacao177 = new Alocacao(disciplina09, turma08);
        Alocacao alocacao178 = new Alocacao(disciplina09, turma08);

        Alocacao alocacao179 = new Alocacao(disciplina09, turma09);
        Alocacao alocacao180 = new Alocacao(disciplina09, turma09);

        Alocacao alocacao181 = new Alocacao(disciplina09, turma10);
        Alocacao alocacao182 = new Alocacao(disciplina09, turma10);

        Alocacao alocacao183 = new Alocacao(disciplina09, turma11);
        Alocacao alocacao184 = new Alocacao(disciplina09, turma11);


        //Prof Ing deve dar 1 aula em cada turma de 1 a 9
        //e 2 aulas nas turmas 10 e 11
        Alocacao alocacao185 = new Alocacao(disciplina10, turma01);
        Alocacao alocacao186 = new Alocacao(disciplina10, turma02);
        Alocacao alocacao187 = new Alocacao(disciplina10, turma03);
        Alocacao alocacao188 = new Alocacao(disciplina10, turma04);
        Alocacao alocacao189 = new Alocacao(disciplina10, turma05);
        Alocacao alocacao190 = new Alocacao(disciplina10, turma06);
        Alocacao alocacao191 = new Alocacao(disciplina10, turma07);
        Alocacao alocacao192 = new Alocacao(disciplina10, turma08);
        Alocacao alocacao193 = new Alocacao(disciplina10, turma09);

        Alocacao alocacao194 = new Alocacao(disciplina10, turma10);
        Alocacao alocacao195 = new Alocacao(disciplina10, turma10);

        Alocacao alocacao196 = new Alocacao(disciplina10, turma11);
        Alocacao alocacao197 = new Alocacao(disciplina10, turma11);


        //Prof Hist deve dar 2 aulas em cada turma de 1 a 9
        //e 3 aulas nas turmas 10 e 11
        Alocacao alocacao198 = new Alocacao(disciplina11, turma01);
        Alocacao alocacao199 = new Alocacao(disciplina11, turma01);

        Alocacao alocacao200 = new Alocacao(disciplina11, turma02);
        Alocacao alocacao201 = new Alocacao(disciplina11, turma02);

        Alocacao alocacao202 = new Alocacao(disciplina11, turma03);
        Alocacao alocacao203 = new Alocacao(disciplina11, turma03);

        Alocacao alocacao204 = new Alocacao(disciplina11, turma04);
        Alocacao alocacao205 = new Alocacao(disciplina11, turma04);

        Alocacao alocacao206 = new Alocacao(disciplina11, turma05);
        Alocacao alocacao207 = new Alocacao(disciplina11, turma05);

        Alocacao alocacao208 = new Alocacao(disciplina11, turma06);
        Alocacao alocacao209 = new Alocacao(disciplina11, turma06);

        Alocacao alocacao210 = new Alocacao(disciplina11, turma07);
        Alocacao alocacao211 = new Alocacao(disciplina11, turma07);

        Alocacao alocacao212 = new Alocacao(disciplina11, turma08);
        Alocacao alocacao213 = new Alocacao(disciplina11, turma08);

        Alocacao alocacao214 = new Alocacao(disciplina11, turma09);
        Alocacao alocacao215 = new Alocacao(disciplina11, turma09);

        Alocacao alocacao216 = new Alocacao(disciplina11, turma10);
        Alocacao alocacao217 = new Alocacao(disciplina11, turma10);
        Alocacao alocacao218 = new Alocacao(disciplina11, turma10);

        Alocacao alocacao219 = new Alocacao(disciplina11, turma11);
        Alocacao alocacao220 = new Alocacao(disciplina11, turma11);
        Alocacao alocacao221 = new Alocacao(disciplina11, turma11);


        //Prof Art deve dar 2 aulas em cada turma de 1 a 9
        Alocacao alocacao222 = new Alocacao(disciplina12, turma01);
        Alocacao alocacao223 = new Alocacao(disciplina12, turma01);

        Alocacao alocacao224 = new Alocacao(disciplina12, turma02);
        Alocacao alocacao225 = new Alocacao(disciplina12, turma02);

        Alocacao alocacao226 = new Alocacao(disciplina12, turma03);
        Alocacao alocacao227 = new Alocacao(disciplina12, turma03);

        Alocacao alocacao228 = new Alocacao(disciplina12, turma04);
        Alocacao alocacao229 = new Alocacao(disciplina12, turma04);

        Alocacao alocacao230 = new Alocacao(disciplina12, turma05);
        Alocacao alocacao231 = new Alocacao(disciplina12, turma05);

        Alocacao alocacao232 = new Alocacao(disciplina12, turma06);
        Alocacao alocacao233 = new Alocacao(disciplina12, turma06);

        Alocacao alocacao234 = new Alocacao(disciplina12, turma07);
        Alocacao alocacao235 = new Alocacao(disciplina12, turma07);

        Alocacao alocacao236 = new Alocacao(disciplina12, turma08);
        Alocacao alocacao237 = new Alocacao(disciplina12, turma08);

        Alocacao alocacao238 = new Alocacao(disciplina12, turma09);
        Alocacao alocacao239 = new Alocacao(disciplina12, turma09);


        //Prof Soc deve dar 1 aula em cada turma de 1 a 11
        Alocacao alocacao240 = new Alocacao(disciplina13, turma01);
        Alocacao alocacao241 = new Alocacao(disciplina13, turma02);
        Alocacao alocacao242 = new Alocacao(disciplina13, turma03);
        Alocacao alocacao243 = new Alocacao(disciplina13, turma04);
        Alocacao alocacao244 = new Alocacao(disciplina13, turma05);
        Alocacao alocacao245 = new Alocacao(disciplina13, turma06);
        Alocacao alocacao246 = new Alocacao(disciplina13, turma07);
        Alocacao alocacao247 = new Alocacao(disciplina13, turma08);
        Alocacao alocacao248 = new Alocacao(disciplina13, turma09);
        Alocacao alocacao249 = new Alocacao(disciplina13, turma10);
        Alocacao alocacao250 = new Alocacao(disciplina13, turma11);


        //Prof Edf deve dar 2 aulas em cada turma de 1 a 9
        Alocacao alocacao251 = new Alocacao(disciplina14, turma01);
        Alocacao alocacao252 = new Alocacao(disciplina14, turma01);

        Alocacao alocacao253 = new Alocacao(disciplina14, turma02);
        Alocacao alocacao254 = new Alocacao(disciplina14, turma02);

        Alocacao alocacao255 = new Alocacao(disciplina14, turma03);
        Alocacao alocacao256 = new Alocacao(disciplina14, turma03);

        Alocacao alocacao257 = new Alocacao(disciplina14, turma04);
        Alocacao alocacao258 = new Alocacao(disciplina14, turma04);

        Alocacao alocacao259 = new Alocacao(disciplina14, turma05);
        Alocacao alocacao260 = new Alocacao(disciplina14, turma05);

        Alocacao alocacao261 = new Alocacao(disciplina14, turma06);
        Alocacao alocacao262 = new Alocacao(disciplina14, turma06);

        Alocacao alocacao263 = new Alocacao(disciplina14, turma07);
        Alocacao alocacao264 = new Alocacao(disciplina14, turma07);

        Alocacao alocacao265 = new Alocacao(disciplina14, turma08);
        Alocacao alocacao266 = new Alocacao(disciplina14, turma08);

        Alocacao alocacao267 = new Alocacao(disciplina14, turma09);
        Alocacao alocacao268 = new Alocacao(disciplina14, turma09);

        //Prof Filo deve dar 1 aula em cada turma de 1 a 11
        Alocacao alocacao269 = new Alocacao(disciplina15, turma01);
        Alocacao alocacao270 = new Alocacao(disciplina15, turma02);
        Alocacao alocacao271 = new Alocacao(disciplina15, turma03);
        Alocacao alocacao272 = new Alocacao(disciplina15, turma04);
        Alocacao alocacao273 = new Alocacao(disciplina15, turma05);
        Alocacao alocacao274 = new Alocacao(disciplina15, turma06);
        Alocacao alocacao275 = new Alocacao(disciplina15, turma07);
        Alocacao alocacao276 = new Alocacao(disciplina15, turma08);
        Alocacao alocacao277 = new Alocacao(disciplina15, turma09);
        Alocacao alocacao278 = new Alocacao(disciplina15, turma10);
        Alocacao alocacao279 = new Alocacao(disciplina15, turma11);



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
        lstAlocacao.add(alocacao70);
        lstAlocacao.add(alocacao71);
        lstAlocacao.add(alocacao72);
        lstAlocacao.add(alocacao73);
        lstAlocacao.add(alocacao74);
        lstAlocacao.add(alocacao75);
        lstAlocacao.add(alocacao76);
        lstAlocacao.add(alocacao77);
        lstAlocacao.add(alocacao78);
        lstAlocacao.add(alocacao79);
        lstAlocacao.add(alocacao80);
        lstAlocacao.add(alocacao81);
        lstAlocacao.add(alocacao82);
        lstAlocacao.add(alocacao83);
        lstAlocacao.add(alocacao84);
        lstAlocacao.add(alocacao85);
        lstAlocacao.add(alocacao86);
        lstAlocacao.add(alocacao87);
        lstAlocacao.add(alocacao88);
        lstAlocacao.add(alocacao89);
        lstAlocacao.add(alocacao90);
        lstAlocacao.add(alocacao91);
        lstAlocacao.add(alocacao92);
        lstAlocacao.add(alocacao93);
        lstAlocacao.add(alocacao94);
        lstAlocacao.add(alocacao95);
        lstAlocacao.add(alocacao96);
        lstAlocacao.add(alocacao97);
        lstAlocacao.add(alocacao98);
        lstAlocacao.add(alocacao99);
        lstAlocacao.add(alocacao100);
        lstAlocacao.add(alocacao101);
        lstAlocacao.add(alocacao102);
        lstAlocacao.add(alocacao103);
        lstAlocacao.add(alocacao104);
        lstAlocacao.add(alocacao105);
        lstAlocacao.add(alocacao106);
        lstAlocacao.add(alocacao107);
        lstAlocacao.add(alocacao108);
        lstAlocacao.add(alocacao109);
        lstAlocacao.add(alocacao110);
        lstAlocacao.add(alocacao111);
        lstAlocacao.add(alocacao112);
        lstAlocacao.add(alocacao113);
        lstAlocacao.add(alocacao114);
        lstAlocacao.add(alocacao115);
        lstAlocacao.add(alocacao116);
        lstAlocacao.add(alocacao117);
        lstAlocacao.add(alocacao118);
        lstAlocacao.add(alocacao119);
        lstAlocacao.add(alocacao120);
        lstAlocacao.add(alocacao121);
        lstAlocacao.add(alocacao122);
        lstAlocacao.add(alocacao123);
        lstAlocacao.add(alocacao124);
        lstAlocacao.add(alocacao125);
        lstAlocacao.add(alocacao126);
        lstAlocacao.add(alocacao127);
        lstAlocacao.add(alocacao128);
        lstAlocacao.add(alocacao129);
        lstAlocacao.add(alocacao130);
        lstAlocacao.add(alocacao131);
        lstAlocacao.add(alocacao132);
        lstAlocacao.add(alocacao133);
        lstAlocacao.add(alocacao134);
        lstAlocacao.add(alocacao135);
        lstAlocacao.add(alocacao136);
        lstAlocacao.add(alocacao137);
        lstAlocacao.add(alocacao138);
        lstAlocacao.add(alocacao139);
        lstAlocacao.add(alocacao140);
        lstAlocacao.add(alocacao141);
        lstAlocacao.add(alocacao142);
        lstAlocacao.add(alocacao143);
        lstAlocacao.add(alocacao144);
        lstAlocacao.add(alocacao145);
        lstAlocacao.add(alocacao146);
        lstAlocacao.add(alocacao147);
        lstAlocacao.add(alocacao148);
        lstAlocacao.add(alocacao149);
        lstAlocacao.add(alocacao150);
        lstAlocacao.add(alocacao151);
        lstAlocacao.add(alocacao152);
        lstAlocacao.add(alocacao153);
        lstAlocacao.add(alocacao154);
        lstAlocacao.add(alocacao155);
        lstAlocacao.add(alocacao156);
        lstAlocacao.add(alocacao157);
        lstAlocacao.add(alocacao158);
        lstAlocacao.add(alocacao159);
        lstAlocacao.add(alocacao160);
        lstAlocacao.add(alocacao161);
        lstAlocacao.add(alocacao162);
        lstAlocacao.add(alocacao163);
        lstAlocacao.add(alocacao164);
        lstAlocacao.add(alocacao165);
        lstAlocacao.add(alocacao166);
        lstAlocacao.add(alocacao167);
        lstAlocacao.add(alocacao168);
        lstAlocacao.add(alocacao169);
        lstAlocacao.add(alocacao170);
        lstAlocacao.add(alocacao171);
        lstAlocacao.add(alocacao172);
        lstAlocacao.add(alocacao173);
        lstAlocacao.add(alocacao174);
        lstAlocacao.add(alocacao175);
        lstAlocacao.add(alocacao176);
        lstAlocacao.add(alocacao177);
        lstAlocacao.add(alocacao178);
        lstAlocacao.add(alocacao179);
        lstAlocacao.add(alocacao180);
        lstAlocacao.add(alocacao181);
        lstAlocacao.add(alocacao182);
        lstAlocacao.add(alocacao183);
        lstAlocacao.add(alocacao184);
        lstAlocacao.add(alocacao185);
        lstAlocacao.add(alocacao186);
        lstAlocacao.add(alocacao187);
        lstAlocacao.add(alocacao188);
        lstAlocacao.add(alocacao189);
        lstAlocacao.add(alocacao190);
        lstAlocacao.add(alocacao191);
        lstAlocacao.add(alocacao192);
        lstAlocacao.add(alocacao193);
        lstAlocacao.add(alocacao194);
        lstAlocacao.add(alocacao195);
        lstAlocacao.add(alocacao196);
        lstAlocacao.add(alocacao197);
        lstAlocacao.add(alocacao198);
        lstAlocacao.add(alocacao199);
        lstAlocacao.add(alocacao200);
        lstAlocacao.add(alocacao201);
        lstAlocacao.add(alocacao202);
        lstAlocacao.add(alocacao203);
        lstAlocacao.add(alocacao204);
        lstAlocacao.add(alocacao205);
        lstAlocacao.add(alocacao206);
        lstAlocacao.add(alocacao207);
        lstAlocacao.add(alocacao208);
        lstAlocacao.add(alocacao209);
        lstAlocacao.add(alocacao210);
        lstAlocacao.add(alocacao211);
        lstAlocacao.add(alocacao212);
        lstAlocacao.add(alocacao213);
        lstAlocacao.add(alocacao214);
        lstAlocacao.add(alocacao215);
        lstAlocacao.add(alocacao216);
        lstAlocacao.add(alocacao217);
        lstAlocacao.add(alocacao218);
        lstAlocacao.add(alocacao219);
        lstAlocacao.add(alocacao220);
        lstAlocacao.add(alocacao221);
        lstAlocacao.add(alocacao222);
        lstAlocacao.add(alocacao223);
        lstAlocacao.add(alocacao224);
        lstAlocacao.add(alocacao225);
        lstAlocacao.add(alocacao226);
        lstAlocacao.add(alocacao227);
        lstAlocacao.add(alocacao228);
        lstAlocacao.add(alocacao229);
        lstAlocacao.add(alocacao230);
        lstAlocacao.add(alocacao231);
        lstAlocacao.add(alocacao232);
        lstAlocacao.add(alocacao233);
        lstAlocacao.add(alocacao234);
        lstAlocacao.add(alocacao235);
        lstAlocacao.add(alocacao236);
        lstAlocacao.add(alocacao237);
        lstAlocacao.add(alocacao238);
        lstAlocacao.add(alocacao239);
        lstAlocacao.add(alocacao240);
        lstAlocacao.add(alocacao241);
        lstAlocacao.add(alocacao242);
        lstAlocacao.add(alocacao243);
        lstAlocacao.add(alocacao244);
        lstAlocacao.add(alocacao245);
        lstAlocacao.add(alocacao246);
        lstAlocacao.add(alocacao247);
        lstAlocacao.add(alocacao248);
        lstAlocacao.add(alocacao249);
        lstAlocacao.add(alocacao250);
        lstAlocacao.add(alocacao251);
        lstAlocacao.add(alocacao252);
        lstAlocacao.add(alocacao253);
        lstAlocacao.add(alocacao254);
        lstAlocacao.add(alocacao255);
        lstAlocacao.add(alocacao256);
        lstAlocacao.add(alocacao257);
        lstAlocacao.add(alocacao258);
        lstAlocacao.add(alocacao259);
        lstAlocacao.add(alocacao260);
        lstAlocacao.add(alocacao261);
        lstAlocacao.add(alocacao262);
        lstAlocacao.add(alocacao263);
        lstAlocacao.add(alocacao264);
        lstAlocacao.add(alocacao265);
        lstAlocacao.add(alocacao266);
        lstAlocacao.add(alocacao267);
        lstAlocacao.add(alocacao268);
        lstAlocacao.add(alocacao269);
        lstAlocacao.add(alocacao270);
        lstAlocacao.add(alocacao271);
        lstAlocacao.add(alocacao272);
        lstAlocacao.add(alocacao273);
        lstAlocacao.add(alocacao274);
        lstAlocacao.add(alocacao275);
        lstAlocacao.add(alocacao276);
        lstAlocacao.add(alocacao277);
        lstAlocacao.add(alocacao278);
        lstAlocacao.add(alocacao279);


        /*RESOLUCAO*/
        AlocacaoHorarioTurma problema = new AlocacaoHorarioTurma(lstAlocacao, lstHorario);
        AlocacaoHorarioTurma solucao = Resolvedor.resolver("solver\\heuristics\\tabuSearch.xml", problema);

        long delay = System.currentTimeMillis() - start;
        System.out.println();
        System.out.println("Demorou " + delay + " milissegundos");


    }
}

