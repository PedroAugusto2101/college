package br.com.questao04;

public class Main {
    public static void main(String[] args) {

        PoligonoRegular pr = new PoligonoRegular(2, 4);
        System.out.println(pr.toString());

        Triangulo tr = new Triangulo(2, 5);
        System.out.println(pr.toString());

        Quadrado qd = new Quadrado(2, 6);
        System.out.println(qd.toString());


    }
}