package br.com.questao04;

public class Main {
    public static void main(String[] args) {
        Padrao p1 = new Padrao(true, true, true, true, false, true);
        p1.setValor(6800.00);
        System.out.println(p1.imprime());
    }
}