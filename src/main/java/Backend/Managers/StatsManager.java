package Backend.Managers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StatsManager {

    public StatsManager() {

        File c = new File("products.txt");

        try {
            Scanner fileScan = new Scanner(c);
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                Scanner lineScan = new Scanner(line).useDelimiter("#");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Productmanager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
