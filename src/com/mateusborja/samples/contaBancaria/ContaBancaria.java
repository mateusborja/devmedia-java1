//java access modifiers and methods set and get
package com.mateusborja.samples.contaBancaria;

public class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private boolean contaAtiva;
    private double saldo;


    public void sacar(double valor) {
        if (valor < 0) {
            return;
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            return;
        }

        saldo += valor;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String toString() {
        return "Informações bancárias do Cliente:\n" + "Nome do Cliente:\n" + "=> " + nomeCliente +
                "\nNumero da Conta:\n" + "=> " + getNumConta() + "\nSeu saldo é:\n" + "=> " + getSaldo();
    }

}
