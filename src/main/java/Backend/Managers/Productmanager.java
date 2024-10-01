package Backend.Managers;

import Backend.DataTypes.Product;
import Backend.DataTypes.StockEntry;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Productmanager {

    private Product[] products = new Product[1000];
    private int size = 0;

    public Productmanager() {
        File f = new File("products.txt");

        try {
            Scanner fileScan = new Scanner(f);
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                Scanner lineScan = new Scanner(line).useDelimiter("#");

                String productName = lineScan.next();
                String productBrand = lineScan.next();
                int productCost = lineScan.nextInt();

                Product s = new Product(productName, productBrand, productCost);
                products[size] = s;
                size++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Productmanager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addProduct(String productName, String productBrand, int productCost) throws IOException {
        Product s = new Product(productName, productBrand, productCost);
        products[size] = s;
        size++;

        dumpArrayToTextFile();
    }

    public void deleteProduct(String productName, String productBrand, int productCost) {
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(productName) && products[i].getProductBrand().equals(productBrand) && products[i].getProductCost() == productCost) {

            }
            index = i;
            products[i-1] = products[i];
        } 
       

    }

    public void dumpArrayToTextFile() throws IOException {
        String output = "";

        for (int i = 0; i < size; i++) {
            output += products[i].getProductName() + "#" + products[i].getProductBrand() + "#" + products[i].getProductCost() + "\n";

        }

        PrintWriter pw = new PrintWriter(new FileWriter("products.txt"));
        pw.write(output);
        pw.close();
    }

    public String[] getColumnNames() {
        String[] out = {"Name", "Brand", "Cost"};
        return out;
    }

    public String[][] getTableData() {
        String[][] out = new String[size][3];

        for (int row = 0; row < size; row++) {
            out[row][0] = products[row].getProductName();
            out[row][1] = products[row].getProductBrand();
            out[row][2] = products[row].getProductCost() + "";

        }

        return out;
    }

}
