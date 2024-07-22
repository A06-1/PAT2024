
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aidanm
 */
public class Q2 {
    public static void main(String[] args) {
        
        String inputOne = JOptionPane.showInputDialog("Enter original Dna");
        String inputTwo = JOptionPane.showInputDialog("Enter backup Dna 2");
        
        String message = "corrupted";
        
        String newBackup = "";
        
        //convert every letter of backup and then see if equal
        for (int i = 0; i < 5; i++) 
        {
            char backLet = inputTwo.charAt(i);
            
            
            if (backLet == 'A')
            {
                newBackup += "T";
                
            }
            else if (backLet == 'T')
            {
                newBackup += "A";
                
            }
            else if (backLet == 'C')
            {
                newBackup += "G";
            }
            else if (backLet == 'G')
            {
               
                newBackup += "C";
            }
            
            
            
            
        }
        
        
        if (newBackup.equals(inputOne))
        {
            message = "ok";
        }
        
        
        System.out.println(message);
//        for (int i = 0; i < 5; i++) 
//        {
//            char origLet = inputOne.charAt(i);
//            char backLet = inputTwo.charAt(i);
//            
//            if (backLet == 'A')
//            {
//                if (origLet == 'T')
//                {
//                    message = "ok";
//                }
//                
//            }
//            else if (backLet == 'T')
//            {
//                if (origLet == 'A')
//                {
//                    message = "ok";
//                }
//                
//            }
//            else if (backLet == 'C')
//            {
//                if (origLet == 'G')
//                {
//                    message = "ok";
//                }
//            }
//            else if (backLet == 'G')
//            {
//                if (origLet == 'C')
//                {
//                    message = "ok";
//                }
//                
//            }
//            
//            
//            
//            
//        }
//        
        
        

        
    }
    
}
