package Backend.Managers;

import Backend.DataTypes.Sales;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            Logger.getLogger(Productmanager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
