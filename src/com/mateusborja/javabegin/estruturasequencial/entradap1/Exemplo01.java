//java type Scanner
package com.mateusborja.javabegin.estruturasequencial.entradap1;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // tipo double com ponto
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: => " + x); // sem quebra de linha -  next() - string, nextInt() - int, nextDouble() - double, next().CharAt(0) - char

        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: => " + y);

        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou: => " + z);

        String m;
        int n;
        double o;

        m = sc.next();
        n = sc.nextInt();
        o = sc.nextDouble();

        System.out.println("Dados digitados: =>" );
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);

    }
}
