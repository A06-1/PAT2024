package Backend.Managers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Productmanager {

    public static ArrayList<String> getItemNames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String getLocation(String selectedItemName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int getCost(String selectedItemName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String getBrand(String selectedItemName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    File a = new File("products.txt");

    public Productmanager() {
        try {
            Scanner fileScan = new Scanner(a);
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                Scanner lineScan = new Scanner(line).useDelimiter("#");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Productmanager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
