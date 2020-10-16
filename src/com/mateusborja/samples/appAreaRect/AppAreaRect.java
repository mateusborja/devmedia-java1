package com.mateusborja.samples.appAreaRect;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AppAreaRect {

    public static void main(String[] args) {

        //class Decimal format
        DecimalFormat dc = new DecimalFormat();
        //class Scanner
        Scanner sc = new Scanner(System.in);
        double width, height, area;

        System.out.println("tell me width: in meters ");
        width = sc.nextDouble();

        System.out.println("tell me heigth: in meters");
        height = sc.nextDouble();

        area = width * height;
        System.out.println("area is: => " + dc.format(area) + " metters");
    }
}
