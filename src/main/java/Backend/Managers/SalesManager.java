package Backend.Managers;

import Backend.DataTypes.Sales;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger; 
//made sales array of 1000+ can read it 


public class SalesManager {

    Sales[] sale = new Sales[1000];
    Sales s = new Sales();

    public SalesManager() {
        File b = new File("products.txt");
        try {
            Scanner fileScan = new Scanner(b);
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                Scanner lineScan = new Scanner(line).useDelimiter("#");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
