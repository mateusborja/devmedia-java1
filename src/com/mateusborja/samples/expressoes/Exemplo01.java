/*
Regra de precedencia
1 lugar parenteses
2 lugar *, /,  %
3 lugar + -
Igual na regra operacao esq. para direita
 */

package com.mateusborja.samples.expressoes;

public class Exemplo01 {

    public static void main(String[] args) {

        int x, y, z, operation;

        x = 10;
        y = 5;
        z = 20;

        operation = x / y * z;
        System.out.println(operation);

        operation = x + y * z;
        System.out.println(operation);

        operation = (x * y) / z;
        System.out.println(operation);

        operation = ((x * y) / z) + 100;
        System.out.println(operation);

        operation = ((x * y) - z) * 15;
        System.out.println(operation);
    }


}
