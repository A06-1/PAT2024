package Backend.DataTypes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Stock {

    String[] stockName = new String[100];
    Date[] stockDate = new Date[100];
    int[] quantity = new int[100];
    String[] description = new String[100];

    public Stock(String[] stockName, Date[] stockDate, int[] quantity, String[] description) {
        this.stockName = stockName;
        this.stockDate = stockDate;
        this.quantity = quantity;
        this.description = description; 
        
        

    } 
    public static void main(String[] args){
        
        File h = new File("stock.txt"); 
        
         
        // Serialization 
        try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("stock.txt");
            ObjectOutputStream out = new ObjectOutputStream(h);
             
            // Method for serialization of object
            out.writeObject(Stock);
             
            out.close();
            file.close();
             
            System.out.println("Object has been serialized");
 
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
 
 
        Stock object1 = null;
 
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream("stock.txt");
            ObjectInputStream in = new ObjectInputStream(h);
             
            // Method for deserialization of object
            object1 = (Stock)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
 
    }

}
