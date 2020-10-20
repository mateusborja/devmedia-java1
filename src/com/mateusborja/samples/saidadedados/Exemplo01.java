package com.mateusborja.samples.saidadedados;

import java.util.Locale;

public class Exemplo01 {

    public static void main(String[] args) {

        //set default computer data input
        Locale.setDefault(Locale.US);

        double number = 10.23456;

        System.out.printf("%.1f%n", number); // uma casa decimal
        System.out.printf("%.2f%n", number); // duas casas decimais
        System.out.printf("%.3f%n", number); // tres casas decimais



    }



}
