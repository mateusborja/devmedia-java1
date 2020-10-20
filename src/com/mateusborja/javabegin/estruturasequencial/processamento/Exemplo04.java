//java casting
package com.mateusborja.javabegin.estruturasequencial.processamento;

import java.util.Locale;

public class Exemplo04 {

    public static void main(String[] args) {

        int x, y;
        double result;

        x = 500;
        y = 200;

        // result 2.5
        result = (double) x / y; // necessario fazer o casting para ter o resultado preciso
        System.out.println(result);



    }


}
