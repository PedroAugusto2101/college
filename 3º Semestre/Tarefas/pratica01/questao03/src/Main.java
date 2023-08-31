import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Nota AV1: ");
        double notaAV1 = scanner.nextDouble();

        System.out.print("Nota AV2: ");
        double notaAV2 = scanner.nextDouble();

        System.out.print("Curso: ");
        String curso = scanner.next();

        System.out.print("Período: ");
        int periodo = scanner.nextInt();

        Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);

        aluno.avaliarAluno();

        System.out.print("Nota AE: ");
        double notaAE = scanner.nextDouble();

        aluno.avaliarRecuperacao(notaAE);

        scanner.close();
    }
}
