//java modifiers
package com.mateusborja.samples.car;

public class Car {

     static String color;
     static String client;
     static int age;

    static {
        color = "blue";
        client = "Joanathas";
        age = 1996;
    }

    public Car(String color, String c) {
        this.color = color;
        this.client = client;

    }


    public static void setColor(String color) {
        Car.color = color;

    }


}

