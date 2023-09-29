package br.com.questao01;

import br.com.questao01.Camarote;
import br.com.questao01.Ingresso;
import br.com.questao01.Normal;
import br.com.questao01.Vip;

public class Main {
    public static void main(String[] args){
        Ingresso i1 = new Normal(50);
        // Normal teste = new Ingresso(100);


        Normal n1 = new Normal(100);
        n1.imprimeIngresso();

        Vip v1 = new Vip(100, 50);
        v1.imprimeIngresso();

        Camarote c1 = new Camarote(100, 100, "Ala 8");
        c1.imprimeIngresso();
    }
}