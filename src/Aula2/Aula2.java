package Aula2;

public class Aula2 {
    public static void main(String[] args) {
        // preciso saber:
        // nome do aluno, idade, curso, turma, ano, disciplina, primeira nota, segunda nota.
        String nome = "Dercio Derone";
        int idade = 45;
        String curso = "Engenharia Informatica";
        int anoCurso = 2;
        String disciplina = "Introducao a Programacao";
        String turma = "LINF2";
        double primeiraNota = 10;
        double segundaNota = 10;
        double mediaNota;

        mediaNota = (primeiraNota + segundaNota)/2;

//        mediaNota--;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("O ano de curso: " + anoCurso);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Turma: " + turma);
        System.out.println("PrimeiraNota: " + primeiraNota);
        System.out.println("SegundaNota: " + segundaNota);
        System.out.println("MediaNota: " + mediaNota);

        if (mediaNota >= 10) {
            System.out.println("O Aluno " + nome +" esta Aprovado!");
        }
        else if (mediaNota >= 7 && mediaNota < 10) {
            System.out.println("O Aluno " + nome +" em recuperacao!");
        }
        else {
            System.out.println("O Aluno " + nome +" esta reprovado!");
        }
    }
}
