package br.com.questao04;

public class Triangulo extends PoligonoRegular{
    public Triangulo(int numLados, float tamLado) {
        super(numLados, tamLado);
    }
    public float calcularArea() {
        return (getTamLado() * getTamLado())/2;
    }
}
