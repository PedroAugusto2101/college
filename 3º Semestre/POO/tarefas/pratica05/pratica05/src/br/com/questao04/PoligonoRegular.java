package br.com.questao04;

public class PoligonoRegular {
    private int numLados;
    private float tamLado;

    public PoligonoRegular(int numLados, float tamLado) {
        this.numLados = numLados;
        this.tamLado = tamLado;
    }

    public int getNumLados() {
        return numLados;
    }

    public float getTamLado() {
        return tamLado;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public void setTamLado(float tamLado) {
        this.tamLado = tamLado;
    }

    public float calcularPerimetro() {
        return getNumLados() * getTamLado();
    }

    public float calcularArea() {
        return getTamLado() * getTamLado();
    }
}
