//method Main class Pessoas
package com.mateusborja.myexamples.pessoas;

public class MainPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p1.nome = "Felipe Cardoso";
        p1.recebe(200);
        p1.fornece(123, p2);

        p2.nome = "Mateus Borja";
        p2.recebe(108);
        p2.fornece(1, p1);
        p2.fornece(1, p2);
        p2.fornece(5, p3);

        p3.nome = "Joao Honorio";
        p3.recebe(15);
        p3.fornece(10, p1);

        System.out.println( p1.nome + " => você têm: " + p1.figuras + " Figurinhas.");
        System.out.println(p2.nome + " => você têm: " + p2.figuras + " Figurinhas.");

        System.out.println("\n"+p3.nome);
        System.out.println("\n=> Você tem: " +p3.figuras + " Figurinhas.");

    }
}
