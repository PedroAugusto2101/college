package br.com.questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DistribuicaoAlimentos da = new DistribuicaoAlimentos("Mesa Brasil", "SESC", "Belo Horizonte","01/09/2023", "30/09/2023","Feijão", 30);
        TrabalhoVoluntario tv = new TrabalhoVoluntario("Mesa Brasil", "SESC", "Belo Horizonte", "01/09/2023", "30/09/2023", "Repositor", 30);

        System.out.println("\n Distribuição de alimento\n" + da.imprimeProjeto());
        System.out.println("\n Trabalho voluntario\n" + tv.imprimeProjeto());
    }
}