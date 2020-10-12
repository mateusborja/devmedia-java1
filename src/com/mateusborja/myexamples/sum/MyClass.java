package com.mateusborja.myexamples.sum;

/*
App sum two values
 */
public class MyClass {

    public void sumValues() {
        int x,y;

        for (x = 100; x < 500; x++) {
            for (y= 100; y < 500; y++){
                int sum = x + y;
                if (sum == 250){
                    System.out.println("A soma de " + x + " + " + y + " é = a " + sum);
                }
            }
        }

    }

}
