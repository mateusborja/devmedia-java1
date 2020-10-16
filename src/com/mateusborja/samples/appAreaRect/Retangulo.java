//java constructor
package com.mateusborja.samples.appAreaRect;

public class Retangulo {

    private static double largura;
    private static double altura;


    public Retangulo() {
        this(4,3);

    }

    public Retangulo(double largura, double altura) {
        Retangulo.altura = altura;
        Retangulo.largura = largura;


    }

    public static double calcularArea() {
        return largura * altura;
    }

    public static void setValores(double largura, double altura) {
        Retangulo.largura = largura;
        Retangulo.altura = altura;
    }



}
