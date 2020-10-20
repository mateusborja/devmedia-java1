//java Scanner nextLine() com quebra de linha e int e String
package com.mateusborja.javabegin.estruturasequencial.entradap1;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome, idade, natural;
        int peso;

        System.out.println("Digite seu nome, seu peso, sua idade e sua cidade natal:");

        nome = sc.nextLine();
        peso = sc.nextInt();
        sc.nextLine(); // chamar o objeto e metodo depois de um int com string na sequencia
        idade = sc.nextLine();
        natural = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println("Seu nome: => " + nome);
        System.out.println("Seu peso: => " + peso + " Kg");
        System.out.println("Sua idade: => " + idade + " anos");
        System.out.println("Natural de: => " + natural);

    }
}
