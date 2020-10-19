//java constructor
package com.mateusborja.samples.apparearect;

public class Retangulo {

    private double largura;
    private double altura;


    public Retangulo() {
        this(4,3);

    }

    public Retangulo(double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public void setValor(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }



}
