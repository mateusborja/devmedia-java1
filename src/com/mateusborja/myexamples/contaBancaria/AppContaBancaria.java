//java access modifiers and methods set and get
package com.mateusborja.myexamples.contaBancaria;


public class AppContaBancaria {

    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        c1.setNomeCliente("Mateus Borja");
        c1.setNumConta(4455);
        c1.setContaAtiva(true);

        c1.depositar(1250);
        c1.sacar(13);

        c2.setNomeCliente("Felipe da Silva");
        c2.setNumConta(5672);

        double s1 = c1.getSaldo();
        var cl2 = c2.getNomeCliente();

        System.out.println(c1.toString() +"\n");

        System.out.println(c2.getNumConta()+"\n");
        System.out.println(cl2);

    }
}
