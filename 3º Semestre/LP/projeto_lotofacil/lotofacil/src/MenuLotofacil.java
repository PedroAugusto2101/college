import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class MenuLotofacil {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int option;

        do {

            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");

            System.out.print("Digite a opção desejada: ");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    aposta_0_100(scan, rand);
                    break;
                case 2:
                    aposta_A_Z(scan);
                    break;
                case 3:
                    aposta_par_impar(scan);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma opção válida!");
            }

        } while (option != 0);

        scan.close();
    }

    private static void aposta_0_100(Scanner scanner, Random random) {

        int numeroSorteado = random.nextInt(101);

        System.out.print("Digite sua aposta, de 0 a 100: ");
        int aposta = scanner.nextInt();

        if (aposta < 0 || aposta > 100) {
            System.out.println("Aposta inválida!");
        } else {
            if (aposta == numeroSorteado) {
                System.out.println("Você ganhou R$ 1.000,00.");
            } else {
                System.out.println("Você errou! Número sorteado: " + numeroSorteado + ".");
            }
        }
    }

    private static void aposta_A_Z(Scanner scanner) {
        System.out.print("Digite uma letra de A a Z: ");
        char letraAposta = scanner.next().toUpperCase().charAt(0);

        char letraSorteada = 'P';

        if (Character.isLetter(letraAposta) && letraAposta >= 'A' && letraAposta <= 'Z') {
            if (letraAposta == letraSorteada) {
                System.out.println("Você ganhou R$ 500,00.");
            } else {
                System.out.println("Você errou! Letra sorteada: " + letraSorteada + ".");
            }
        } else {
            System.out.println("Aposta inválida!");
        }
    }

    private static void aposta_par_impar(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        int numeroAposta = scanner.nextInt();

        if (numeroAposta % 2 == 0) {
            System.out.println("Você ganhou R$ 100,00.");
        } else {
            System.out.println("Você errou! A premiação foi para números pares.");
        }
    }
}
