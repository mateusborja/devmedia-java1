//java casting
package com.mateusborja.javabegin.estruturasequencial.processamento;

public class Exemplo02 {

    public static void main(String[] args) {

        double x;
        int y;

        x = 5.0;
        y = 3;

        System.out.println(x + " e " + y);

        x = 5.0;
        y = (int) x; // casting
        System.out.println(x + " e " + y);

    }
}
