/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import javax.swing.JOptionPane;

/**
 *
 * @author dalonsoperez y mblancosoto
 */
public class JavaApplication27 {



    public static void main(String[] args) {
       
       JOptionPane.showInputDialog("Para calcular el área del pentágono:");
       
       double a = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la apotema"));
       double l = Integer.parseInt(JOptionPane.showInputDialog("Introduce lado"));
       
       JOptionPane.showMessageDialog(null, "El area del pentágono de lado " + l + "cm y apotema " + a + "cm es igual a " + l*5*a/2 + "cm².");

       
        

    }
    
}
