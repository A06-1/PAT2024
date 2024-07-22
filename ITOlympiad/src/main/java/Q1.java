
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aidanm
 */
public class Q1 {
    public static void main(String[] args) 
    {        
        double X = Double.parseDouble(JOptionPane.showInputDialog("Ënter x co-ordinate"));
        double Y = Double.parseDouble(JOptionPane.showInputDialog("Ënter y co-ordinate"));
                
        double output = Math.sqrt((Math.pow(X,2) + Math.pow(Y,2)));
        
        if (output > 1)
        {
            System.out.println("BLUE");
        }
        else
        {
            System.out.println("RED");
        }

        
        
    }
    
   
    
}
