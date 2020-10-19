package com.mateusborja.samples.appmedia;

import java.util.Scanner;

public class AppMedia {

    public static void main(String[] args) {

        Scanner md = new Scanner(System.in);

        double x, y, media;

        System.out.println("Digite o primeiro número: =>");
        x = md.nextDouble();

        System.out.println("Digite o segundo número: =>");
        y = md.nextDouble();

        media = (x + y) / 2;
        System.out.println("A média é: => " + media);

    }
}
