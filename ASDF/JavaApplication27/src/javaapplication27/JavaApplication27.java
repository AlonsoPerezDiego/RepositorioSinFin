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
        
       int a = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la apotema"));
       int l = Integer.parseInt(JOptionPane.showInputDialog("Introduce lado"));
    }
    
}
