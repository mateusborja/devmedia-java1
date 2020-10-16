// java constructor
package com.mateusborja.samples.appAreaRect;


public class Quadrado {

    private static double lado;


    public Quadrado () {
        this (5);
    }

    public Quadrado (double lado) {
        Quadrado.lado = lado;
    }

    public static double calcularArea() {
        return lado * lado;
    }


    public static void setLado(double lado) {
        Quadrado.lado = lado;
    }
}
