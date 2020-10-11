//salary app with method
package com.myexamples.mateusborja;

import javax.swing.*;
import java.text.DecimalFormat;

public class Salario {

    DecimalFormat df = new DecimalFormat();


    public void resultado() {
        int ct = 1;
        int total = 0;
        double media = 0;

        String name = JOptionPane.showInputDialog("Qual seu nome?");

        while (ct <= 12) {
            String salario = JOptionPane.showInputDialog("Digite seu " + ct + " salário?");
            double valor = Double.parseDouble(salario);
            total += valor;
            ct++;
        }

        media = total / 12;
        JOptionPane.showMessageDialog(null, name + " seu 13 salário é = R$ " + df.format(media));
    }


}
