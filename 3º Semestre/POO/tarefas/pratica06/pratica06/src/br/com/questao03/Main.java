package br.com.questao03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Artigo> artigos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Artigo artigo = new Artigo("Artigo " + i, "Resumo do Artigo " + i, "Autor " + i);
            artigos.add(artigo);
        }

        Edicao edicao = new Edicao(1, 1, "01/10/2023", 1000);
        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        RevistaCientifica revista = new RevistaCientifica("Minha Revista", 1234567890L, "Mensal");
        revista.adicionaEdicao(edicao);

        System.out.println("Revista Científica:");
        System.out.println("Título: " + revista.getTitulo());
        System.out.println("ISSN: " + revista.getIssn());
        System.out.println("Periodicidade: " + revista.getPeriodicidade());
        System.out.println("Edições na Revista:");
        for (Edicao e : revista.getEdicoes()) {
            System.out.println("Número: " + e.getNumero());
            System.out.println("Volume: " + e.getVolume());
            System.out.println("Data de Edição: " + e.getDataEdicao());
            System.out.println("Tiragem: " + e.getTiragem());
            System.out.println("Artigos na Edição:");
            for (Artigo a : e.getArtigos()) {
                System.out.println("Título: " + a.getTitulo());
                System.out.println("Resumo: " + a.getResumo());
                System.out.println("Autores: " + a.getAutores());
            }
        }
    }
}
