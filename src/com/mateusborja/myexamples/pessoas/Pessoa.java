package com.mateusborja.myexamples.pessoas;

public class Pessoa {

    String nome;
    String callname;
    int figuras;

    void recebe(int figuras) {

        this.figuras = figuras;
    }

    void fornece(int figuras, Pessoa p) {
        this.figuras -= figuras;
        p.figuras += figuras;
        //p.recebe(figuras);

    }

    public String retornarNome(String callname) {
        return this.callname;
    }

    public String qualNome(String nome) {
        return this.nome;
    }


}

