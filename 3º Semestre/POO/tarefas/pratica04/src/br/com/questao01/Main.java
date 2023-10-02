package br.com.questao01;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();

        cp.setSaldo(2121);
        cp.imprimeExtrato();
    }
}