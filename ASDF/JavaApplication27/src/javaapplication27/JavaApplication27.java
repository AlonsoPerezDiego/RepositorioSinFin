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
       //A pastar
           JOptionPane.showMessageDialog(null, "Para calcular el área del pentágono y hexagono :");
        
       double a = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la apotema del pentágono"));
       double l = Double.parseDouble(JOptionPane.showInputDialog("Introduce lado del pentágono"));
       double l2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce lado del hexágono"));
       double a2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la apotema del hexágono"));

       
       JOptionPane.showMessageDialog(null, "El area del pentágono de lado " + l + "cm y apotema " + a + "cm es igual a " + l*5*a/2 + "cm².");
       JOptionPane.showMessageDialog(null, "El area del hexagono de lado " + l2 + "cm y apotema " + a2 + "cm es igual a " + l2*6*a2/2 + "cm².");

       
        

    }
    
}
