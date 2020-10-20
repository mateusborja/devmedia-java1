//java Scanner - nextLine()
package com.mateusborja.javabegin.estruturasequencial.entradap1;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x, y, z;

        x = sc.nextLine();
        y = sc.nextLine();
        z = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }


}
