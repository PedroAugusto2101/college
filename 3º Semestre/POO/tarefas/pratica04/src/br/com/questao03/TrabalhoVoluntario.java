package br.com.questao03;

public class TrabalhoVoluntario extends Projeto{
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto(){
        if(getDuracaoTrabalho() > 2)
            return true;
        else
            return false;
    }
    public String imprimeProjeto(){
        return "Nome: " + getNomeProjeto() + "\n Descrição: " + getDescricao() + "\n Data inicio: " + getDatainicio() + "\n Data fim: " + getDatafim() + "\n Tipo Trabalho: " + getTipoTrabalho() + "\n Duração Trabalho: " + getDuracaoTrabalho();
    }
}