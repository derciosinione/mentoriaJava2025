package Introducao;

public class Aula3 {
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

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("O ano de curso: " + anoCurso);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Turma: " + turma);
        System.out.println("PrimeiraNota: " + primeiraNota);
        System.out.println("SegundaNota: " + segundaNota);
        System.out.println("MediaNota: " + mediaNota);

        String status;

        if (mediaNota >= 10 && mediaNota <= 20)
            status = "Aprovado";
        else if (mediaNota >= 7 && mediaNota < 10)
            status = "Recuperacao";
        else
            status = "Reprovado";

        switch (status){
            case "Aprovado":
                System.out.println("O Aluno " + nome +" esta Aprovado!");
                System.out.println("Parabens");
                break;
            case "Recuperacao":
                System.out.println("O Aluno " + nome +" em recuperacao!");
                System.out.println("Nao desanima, ainda tem mais uma chance");
                break;
            case "Reprovado":
                System.out.println("O Aluno " + nome +" esta reprovado!");
                System.out.println("Tenta mais uma vez proximo ano");
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }
}
