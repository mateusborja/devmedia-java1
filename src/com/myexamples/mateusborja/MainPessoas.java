//method Main class Pessoas
package com.myexamples.mateusborja;

public class MainPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        Pessoa m3 = new Pessoa();


        m3.nome = "Felipe Saldanha";

        p1.nome = "Felipe";
        p2.nome = "Joao";


        p1.recebe(500);
        p1.fornece(123, p2);

        p2.fornece(1, p1);
        p2.recebe(10);


        System.out.println("Você " + p1.nome + " têm " + p1.figuras);
        System.out.println("Você " + p2.nome + " têm " + p2.figuras);

        System.out.println(m3.retornarNome());


    }
}
