package com.java1.devmedia.exercicios.variaveis;

public class CalculadoraCaminhada {

    private double distanciaEmKm;
    private double velocidadeEmKmHora;
    private int paradasTotais;
    private int tempoDeDescansoemMilisegundos;

    public CalculadoraCaminhada(double distanciaEmKm, double velocidadeEmKmHora, int paradasTotais, int tempoDeDescansoemMilisegundos){
        this.distanciaEmKm = distanciaEmKm;
        this.velocidadeEmKmHora = velocidadeEmKmHora;
        this.paradasTotais = paradasTotais;
        this.tempoDeDescansoemMilisegundos = tempoDeDescansoemMilisegundos;
    }

    public void tempoDeCaminhada() {

    }


    public double getDistanciaEmKm() {
        return distanciaEmKm;
    }

    public double getVelocidadeEmKmHora() {
        return velocidadeEmKmHora;
    }

    public int getParadasTotais() {
        return paradasTotais;
    }

    public int getTempoDeDescansoemMilisegundos() {
        return tempoDeDescansoemMilisegundos;
    }

    public void setDistanciaEmKm(double distanciaEmKm) {
        this.distanciaEmKm = distanciaEmKm;
    }

    public void setVelocidadeEmKmHora(double velocidadeEmKmHora) {
        this.velocidadeEmKmHora = velocidadeEmKmHora;
    }

    public void setParadasTotais(int paradasTotais) {
        this.paradasTotais = paradasTotais;
    }

    public void setTempoDeDescansoemMilisegundos(int tempoDeDescansoemMilisegundos) {
        this.tempoDeDescansoemMilisegundos = tempoDeDescansoemMilisegundos;
    }
}
