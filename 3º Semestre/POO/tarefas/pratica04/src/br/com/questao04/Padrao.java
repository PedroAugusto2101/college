package br.com.questao04;

public class Padrao extends Celular{
    public Padrao(boolean mensagem, boolean internet, boolean email, boolean radio, boolean tv, boolean verificar) {
        super(mensagem, internet, email, radio, tv, verificar);
    }

    boolean Botao;
    boolean getCamera;
    boolean getFone;
    boolean getControleVol;

    public void setBotao(boolean botao){
        this.Botao = true;
    }

    public void setGetCamera(){
        this.getCamera = true;
    }

    public void setGetFone(){
        this.getFone = true;
    }

    public void setGetControleVol(){
        this.getControleVol = true;
    }
}