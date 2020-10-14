package com.mateusborja.myexamples.contabancaria;

public class AppContaBancaria {

    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();

        c1.setNomeCliente("Mateus Borja");
        c1.setNumConta(4455);
        c1.setContaAtiva(true);

        c1.depositar(1250);
        c1.sacar(13);

        double s1 = c1.getSaldo();

        System.out.println(c1.toString());

    }
}
