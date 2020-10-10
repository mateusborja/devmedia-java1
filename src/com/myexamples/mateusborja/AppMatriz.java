package com.myexamples.mateusborja;

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeCellEditor;

public class AppMatriz {

    public int mat[][];
    int aux = 0;
    DataInputStream ler = new DataInputStream(System.in);

    public AppMatriz(int i) {
        mat = new int[i][i];
        aux = i;
    }

    public int[][] leitura() {
        for (int i = 0; i < (aux); i++) {
            for (int j = 0; j < (aux); j++) {
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para " + (i + 1) + "ª linha e da " + (j + 1) + "ª coluna "));
            }
        }
        System.out.println();
        return this.mat;
    }

    public int[][] adicao(int mat1[][], int mat2[][], int tam) {
        int a[][] = new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                a[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return a;
    }

    public int[][] subtracao(int mat1[][], int mat2[][], int tam) {
        int a[][] = new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                a[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return a;
    }

    public void mostra(int aux[][], int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(aux[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] multiplica(int mat1[][], int mat2[][], int tam) {
        int s, aux;
        int a[][] = new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                aux = 0;
                for (int k = 0; k < tam; k++) {
                    aux += (mat1[i][k] * mat2[k][j]);
                }
                a[i][j] = aux;
            }
        }

        return a;
    }

    public void determine() {
        for (int i = 0; i <100; i++){
            System.out.println();
        }

    }


}