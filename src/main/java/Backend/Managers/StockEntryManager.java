package Backend.Managers;

import Backend.DataTypes.StockEntry;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//get stock total works 
//get stock date works+formatter 
//get stock quantity works 
//get product/stock name 

public class StockEntryManager {

    private StockEntry[] items = new StockEntry[1000];
    private int size;

    public StockEntryManager() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd\\MM\\yyyy");
        try {

            File f = new File("stock.txt");
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String productName = lineSc.next();
                String stockingDateStr = lineSc.next();
                int quantity = lineSc.nextInt();

                LocalDate stockingDate = LocalDate.parse(stockingDateStr, dtf);

                StockEntry s = new StockEntry(productName, stockingDate, quantity);
                items[size] = s;
                size++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StockEntryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //given a product, we need to know the amount of stock
    public int getStockCount(String productName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getProductName().equals(productName)) {
                count += items[i].getQuantity();
            }

        }
        return count;
    }

}
