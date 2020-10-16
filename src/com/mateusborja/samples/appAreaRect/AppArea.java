package com.mateusborja.samples.appAreaRect;

import java.util.Scanner;

public class AppArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double width, height, area;

        System.out.println("tell me width: in meters ");
        width = sc.nextDouble();

        System.out.println("tell me heigth: in meters");
        height = sc.nextDouble();

        area = width * height;
        System.out.println("area is: => " + area + " metters");
    }
}
