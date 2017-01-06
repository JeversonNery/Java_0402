/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_0402;

import java.util.Scanner;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        String nm = JOptionPane.showInputDialog(null, "Nome completo: ");
        
        String sx = JOptionPane.showInputDialog(null, "Sexo (M ou F): ");
        char ch = sx.charAt(0);
        
        String rda = JOptionPane.showInputDialog(null, "Renda familiar: ");
        double rf = Double.parseDouble(rda);
        
        JOptionPane.showMessageDialog(null, "\nDADOS GRAVADOS:" + "\nNome:\t" + 
                nm + "\nSexo:\t" + ch + "\nRenda:\t" + nf.format(rf));
   }
    
}
