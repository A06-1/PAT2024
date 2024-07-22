
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
public class Q3 {

    public static void main(String[] args) {
        int inputL = Integer.parseInt(JOptionPane.showInputDialog("Enter length pf table"));
        String heights = JOptionPane.showInputDialog("Enter heights on table");
       
        int noOfSand = 0;
  
        int[] arr = new int[inputL];
        
        Scanner sc = new Scanner(heights);
        
        for (int i = 0; i < inputL; i++) 
        {
           
          arr[i] = sc.nextInt();
           
        }
        
        for (int i = 0; i < inputL; i++) 
        {
            
        }
 
    }
}
