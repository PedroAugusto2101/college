package br.com.questao03;

import java.util.ArrayList;

public class RevistaCientifica {
    private String titulo;
    private long issn;
    private String periodicidade;
    private ArrayList<Edicao> edicoes;

    public RevistaCientifica(String titulo, long issn, String periodicidade) {
        this.titulo = titulo;
        this.issn = issn;
        this.periodicidade = periodicidade;
        this.edicoes = new ArrayList<>();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public long getIssn() {
        return issn;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public ArrayList<Edicao> getEdicoes() {
        return edicoes;
    }

    public void adicionaEdicao(Edicao edicao) {
        edicoes.add(edicao);
    }
}
