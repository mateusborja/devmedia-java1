//java function Math.sqrt (x), Math.pow(x,Y) and Math.abs (x)
package com.mateusborja.javabegin.estruturasequencial.funcoes;

public class Exemplo01 {

    public static void main(String[] args) {

        double x, y,z ;
        double A, B, C;

        x = 3.0;
        y = 16.0;
        z = -5.0;

        //raiz quadrada
        A = Math.sqrt(y);
        System.out.println("A raiz quadrada de " + y + " é igual a: " + A);

        //potencia
        B = Math.pow(x, x);
        System.out.println(x + " elevado a " + x + " é igual a: " + B);

        //valor absoluto
        C = Math.abs(z);
        System.out.println("O Valor absoluto de " + z +  " é igual a: " + C);

    }
}
