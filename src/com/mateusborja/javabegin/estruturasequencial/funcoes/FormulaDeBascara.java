//java function Math
package com.mateusborja.javabegin.estruturasequencial.funcoes;

public class FormulaDeBascara {

    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;
        a = 2;
        b = 12;
        c = -14;

        // calcular 2x2 + 12x – 14 = 0 - a = 2, b = 12 e c = -14.
        delta = Math.pow(b, 2.0) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta) / (2.0 * a));
        x2 = (-b - Math.sqrt(delta) / (2.0 * a));

        System.out.println("Delta é igua a: => " + delta);
        System.out.println("x1 é igua a: => " + x1);
        System.out.println("x2 é igua a: => " + x2);

    }

}
