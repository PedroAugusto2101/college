package br.com.questao01;

import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;
    private ArrayList<Publicacao> publicacoes;

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.publicacoes = new ArrayList<>();
    }

    public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
        System.out.println("Conteúdo das publicações:");
        for (Publicacao publi : publicacoes) {
            System.out.println("Data de Publicação: " + publi.getDataPublicacao());
            System.out.println("Texto de Publicação: " + publi.getTextoPublicacao());
        }
    }
}
