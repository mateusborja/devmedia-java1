package com.mateusborja.samples.arr;

public class MainMyArr {
    public static void main(String[] args) {
        MyArr myarr = new MyArr();

        MyArr p1 = new MyArr();
        p1.returnName(p1.name);

        p1.name = "Joao";

        System.out.println("\n" + p1.returnName(p1.name) + "\n");
        myarr.getSum();

    }
}
