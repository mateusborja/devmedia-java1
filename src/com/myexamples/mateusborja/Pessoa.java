package com.myexamples.mateusborja;

public class Pessoa {

    String nome;
    int figuras;

    String callname;

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


}

