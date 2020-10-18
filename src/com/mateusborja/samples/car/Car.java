//java modifiers
package com.mateusborja.samples.car;

public class Car {

    private static String color;
    private static String client;
    private static int age;

    static {
        color = "blue";
        client = "Joanathas";
        age = 1996;
    }


    public Car(String color, String client) {
        this.color = color;
        this.client = client;

    }

    public void myCar() {
        System.out.println("Meu carro é azul...");


    }


}

