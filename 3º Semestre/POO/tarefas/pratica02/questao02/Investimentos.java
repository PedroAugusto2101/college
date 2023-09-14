import java.util.Scanner;

public class Investimentos {
    private double investimentoInicial;
    private double taxaMensal;
    private int numeroDeMeses;

    public Investimentos(double investimentoInicial, double taxaMensal, int numeroDeMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaMensal = taxaMensal;
        this.numeroDeMeses = numeroDeMeses;
    }

    public double calcularRendimento() {
        double montanteFinal = investimentoInicial * Math.pow(1 + (taxaMensal / 100), numeroDeMeses);
        return montanteFinal - investimentoInicial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o investimento inicial: ");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Informe a taxa de rendimento mensal (em %): ");
        double taxaMensal = scanner.nextDouble();

        System.out.print("Informe o número de meses: ");
        int numeroDeMeses = scanner.nextInt();

        Investimentos investimento = new Investimentos(investimentoInicial, taxaMensal, numeroDeMeses);

        double rendimento = investimento.calcularRendimento();

        System.out.println("O rendimento do investimento é de R$ " + rendimento);
    }
}
