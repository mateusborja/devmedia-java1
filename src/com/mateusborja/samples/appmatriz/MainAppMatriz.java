package com.mateusborja.samples.appmatriz;

import javax.swing.*;

public class MainAppMatriz {

    public static void main(String[] args) {

        int x = 0;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da matriz quadrada"));

        AppMatriz primeira = new AppMatriz(x);
        AppMatriz segunda = new AppMatriz(x);

        int mat1[][] = new int[x][x];

        int mat2[][] = new int[x][x];

        int mat3[][] = new int[x][x];

        mat1 = primeira.leitura();
        System.out.println();
        mat2 = segunda.leitura();
        System.out.println();

        System.out.println("MATRIZES: ");
        primeira.mostra(mat1, x);
        System.out.println();

        primeira.mostra(mat2, x);
        System.out.println();

        mat3 = primeira.adicao(mat1, mat2, x);
        System.out.println("SOMA: ");
        primeira.mostra(mat3, x);
        System.out.println();

        mat3 = primeira.subtracao(mat1, mat2, x);
        System.out.println("SUBTRACAO: ");
        primeira.mostra(mat3, x);
        System.out.println();

        mat3 = primeira.multiplica(mat1, mat2, x);
        System.out.println("MULTIPLICACAO: ");
        primeira.mostra(mat3, x);


    }
}
