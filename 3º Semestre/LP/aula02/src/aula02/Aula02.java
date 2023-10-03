package aula02;

import java.io.IOException;
import java.sql.SQLOutput;

public class Aula02 {
    public static void main(String[] args) throws IOException {
        System.out.println("Olá, mundo!");

        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);
        ch++; // incrementa ch
        System.out.println("ch is now " + ch);
        ch = 90; // dá a ch o valor 90
        System.out.println("ch is now " + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f; // necessário o f para ser float
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 93213324341L; // necessário o L para ser long
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBooleano = " + tipoBooleano);

        // Demonstra sequências de escape em strings.
        System.out.println("\nFirst line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

        // Demonstra valores booleanos
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        // um valor booleano pode controlar a isntrução if
        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");
        // o resultado de um operador relacional é um valor booleano
        System.out.println("10 > 9 is " + (10 > 9));

        int count = 10; // dá a count um valor inicial igual a 10
        char chr = 'X'; // inicializa chr com a letra X
        float f = 1.2F; // f é inicializada com 1,2

        int x = 0, y = 8, z = 19, w = 0; // y e z têm inicializações

        System.out.println(x + y + z + w);

        // Demonstra a inicialização dinâmica.
        double radius = 4, height = 5;
        // inicializa volume dinamicamente
        double volume = 3.1416 * radius * height;
        System.out.println("\nVolume is " + volume);

        // Demonstra o escopo de bloco
        int m;
        m = 10;
        if (m == 10) { // inicia novo escopo
            int n = 20; // conhecida apenas nesse bloco
            // tanto m quanto n são conhecidas aqui
            System.out.println("m and n: " + m + " " + n);
            m = n * 2;
        }
        // n = 100; // Erro! n não é conhecida aqui
        // m ainda é conhecida aqui
        System.out.println("m is " + m);

        // Demonstra o tempo  de vida de uma variável
        for (int i = 0; i < 3; i++) {
            int j = -1;
            System.out.println("j is: " + j);
            j = 100;
            System.out.println("j is now: " + j);
        }

        // Demonstra o operador %
        int iresult, irem;
        double dresult, drem;
        iresult = 10 / 3;
        irem = 10 % 3;
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;
        System.out.println("\nResult and remainder of 10 / 3: " + iresult + " " + irem);
        System.out.println("Result and remainder of 10.0 / 3.0: " + dresult + " " + drem);

        // Demonstra os operedores relacionais e lógicos.
        int i, j; boolean b1, b2;
        i = 10;
        j = 11;
        if(i < j) System.out.println("\ni < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("this won't execute");
        if(i >= j) System.out.println("this won't execute");
        if(i > j) System.out.println("this won't execute");

        b1 = true;
        b2 = false;
        if(b1 & b2)
            System.out.println("this won't execute");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");

        // Demosntra os operadores de curto-circuito.
        int n, d, g;
        n = 10; d = 2;
        if(d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
        d = 0; // configura o d com zero
        // Já que d é igual a zero, o segundo operando não é avaliado.
        if(d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
        System.out.println("Passou\n");
        /* Tente a mesma coisa sem Isso causará um erro de divisão por zero */
        if(d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
        System.out.println("Não passou\n");

        // Letras maiúsculas.
        char chh;
        for(int t = 0; t < 10; t++) {
            chh = (char) ('a' + t);
            System.out.println(chh);
            // Essa instrução desativa o 6o bit.
            chh = (char) ((int) chh & 65503); //agora chh é maiúscula
            System.out.print(chh + " ");
        }

        // Pré-incremento (++x):
        x = 5;
        int resultado = ++x; // Pré-incremento: incrementa x antes de usá-lo em qualquer operação
        System.out.println("\nx: " + x); // Output: x: 6
        System.out.println("resultado: " + resultado); // Output: resultado: 6

        // Pós-incremento (x++)
        x = 5;
        int resultado2 = x++; // Pós-incremento: usa o valor atual de x e depois o incrementa
        System.out.println("\nx: " + x); //Output: x: 6 (incrementado após a atribuição)
        System.out.println("resultado: " + resultado2); // Output: resultado: 5 (valor antes do incremento)

        // Lê em caractere no teclado
        char chx;
        System.out.println("\nPress a key followed by ENTER: ");
        chx = (char) System.in.read(); // obtém um char
        System.out.println("Your key is: " + chx);

        // Adivinhe a letra do jogo
        char chxy, answer = 'A';
        System.out.println("\nI'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it: ");
        chxy = (char) System.in.read(); // lê um char no teclado
        if (chxy == answer) System.out.println("** Right **");
        else System.out.println("...Sorry, you're wrong.");

        // Operador Ternário
        int numero = 10;
        // usando o operador ternário para verificar se o número é par ou ímpar
        String result = (numero % 2 == 0) ? "par" : "ímpar";
        System.out.println("O número " + numero + " é " + result + ".");

        // Declaração do enum
        enum DiaDaSemana {
            SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
        }

        // Uso do enum
        DiaDaSemana dia = DiaDaSemana.DOMINGO;

        // Exemplo de uso do switch-case com enum
        switch (dia) {
            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                System.out.println("Dia de trabalho.");
                break;
            case SABADO:
            case DOMINGO:
            System.out.println("Final de semana.");
            break;
        }

        // Exibe as raízes quadradas de 1 a 99 e o erro de arredondamento
        double num, sroot, rerr;
        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sroot);
            // calcula o erro de arredondamento
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }

        for (i=0, j=10; i < j; i++, j--)
            System.out.println("i and j: " + i + " " + j);

        // Executa o laço até S ser digitado.
        System.out.println("Press S to stop.");
        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass #" + i);

        // Partes de for podem estar vazias
        for (i = 0; i < 10; ) {
            System.out.println("Pass#" + i);
            i++; // incrementa a variável de controle de laço
        }

        // O corpo de um laço pode estar vazio

        int sum = 0;
        // soma os números até 5
        for (i = 1; i <= 5; sum += i++);

        System.out.println("Sum is " + sum);
    }

}
