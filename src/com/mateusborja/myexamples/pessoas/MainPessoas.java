//method Main class Pessoas
package com.mateusborja.myexamples.pessoas;

public class MainPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        Pessoa m1 = new Pessoa();
        Pessoa m2 = new Pessoa();


        m1.callname = "Felipe Saldanha";
        m1.recebe(10);
        m1.fornece(4, m2);

        m2.callname = "Joao Pedro";
        m2.recebe(54);
        m2.fornece(13, m1);

        p1.nome = "Felipe";
        p1.recebe(500);
        p1.fornece(123, p2);

        p2.nome = "Joao";
        p2.fornece(1, p1);
        p2.recebe(10);

        p2.fornece(1, m2);

        System.out.println( p1.nome + " você têm " + p1.figuras);
        System.out.println(p2.nome + " você têm " + p2.figuras);

        System.out.println(m1.callname + " você têm " + m1.figuras);
        System.out.println(m2.callname + " você têm " + m2.figuras);

        System.out.println(m1.callname);
        System.out.println(m2.callname);


    }
}
