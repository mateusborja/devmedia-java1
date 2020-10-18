package com.mateusborja.samples.car;

public class MainCar {
    public static void main(String[] args) {

        Car getAno = new Car("Blue", "Jonathas");

        Car.setColor("Yellow");
        System.out.println(Car.color);


    }
}
