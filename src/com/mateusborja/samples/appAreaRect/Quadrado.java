// java constructor
package com.mateusborja.samples.appAreaRect;


public class Quadrado {

    private double lado;


    public Quadrado () {
        this (5);
    }

    public Quadrado (double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public  void setLado(double lado) {
        this.lado = lado;

    }


}
