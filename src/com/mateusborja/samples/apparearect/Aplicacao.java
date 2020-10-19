//java constructor and java modifiers
package com.mateusborja.samples.apparearect;

public class Aplicacao {

    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(35,45);
        double area1 = r1.calcularArea();

        Quadrado.setLado(25);
        double areaq1 = Quadrado.calcularArea();

        System.out.println(area1);
        System.out.println(areaq1);

    }
}
