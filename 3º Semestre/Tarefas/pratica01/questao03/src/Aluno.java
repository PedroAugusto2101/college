public class Aluno {
    // Atributos
    private String nome;
    private String matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private int periodo;

    // Construtor
    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    // Métodos para alterar notas
    public void alteraNotaAV1(double novaNota) {
        notaAV1 = novaNota;
    }

    public void alteraNotaAV2(double novaNota) {
        notaAV2 = novaNota;
    }

    public void alteraNotaAE(double novaNota) {
        notaAE = novaNota;
    }

    // Método para avaliar aluno
    public void avaliarAluno() {
        double totalAV = notaAV1 + notaAV2;
        if (totalAV >= 60) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno em Recuperação");
        }
    }

    // Método para avaliar recuperação
    public void avaliarRecuperacao(double notaAE) {
        double media = (notaAV1 + notaAV2 + notaAE) / 3;
        if (media >= 60) {
            System.out.println("Aluno Aprovado na Recuperação");
        } else {
            System.out.println("Aluno Reprovado na Recuperação");
        }
    }
}
