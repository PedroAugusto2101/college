package br.com.questao04;

public abstract class Celular{
    private boolean mensagem;
    private boolean internet;
    private boolean email;
    private boolean radio;
    private boolean tv;
    private boolean verificar;
    private double valor;

    public Celular(boolean mensagem, boolean internet, boolean email, boolean radio, boolean tv, boolean verificar) {
        this.mensagem = mensagem;
        this.internet = internet;
        this.email = email;
        this.radio = radio;
        this.tv = tv;
        this.verificar = verificar;
    }

    public boolean isMensagem() {
        return mensagem;
    }

    public void setMensagem(boolean mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isVerificar() {
        return verificar;
    }

    public void setVerificar(boolean verificar) {
        this.verificar = verificar;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String imprime(){
        return "Envia mensagem?:" + isMensagem() + "\n" + "Acessa a internet?:" + isInternet() + "\n" + "Acessa aos emails?:" + isEmail() + "\n" + "Possui rádio?:" + isRadio() + "\n" + "Possui TV?:" + isTv() + "\n" + "Faz verificação de arquivos?:" + isVerificar() + "\n" + "Possui um valor de:" + getValor() + "R$!";
    }
}