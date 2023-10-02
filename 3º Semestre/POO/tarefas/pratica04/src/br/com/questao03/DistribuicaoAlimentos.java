package br.com.questao03;

import java.util.Objects;

public class DistribuicaoAlimentos extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimentos(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public boolean validaProjeto(){
        if (Objects.equals(getDatafim(), ""))
            return true;
        else
            return false;
    }

    public String imprimeProjeto(){
        return "Nome: " + getNomeProjeto() + "\n Descrição: " + getDescricao() + "\n Data inicio: " + getDatainicio() + "\n Data fim: " + getDatafim() + "\n Descrição Alimento: " + getDescAlimento() + "\n Quantidade: " + getQtde();
    }
}