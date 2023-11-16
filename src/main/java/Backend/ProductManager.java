/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aidanm
 */
public class ProductManager {
    
    public static ArrayList<String> getItemNames() throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        File f = new File("items.txt");
        Scanner scFile = new Scanner(f);

        //loop each line
        while (scFile.hasNext()) {

            //line and line scanner
            String line = scFile.nextLine();
            Scanner scLine = new Scanner(line).useDelimiter("#");

            //tokenization
            String itemName = scLine.next();
            String brandName = scLine.next();
            int price = scLine.nextInt();
            String storageLocation = scLine.next();
            int productStock = scLine.nextInt();

            //test
            list.add(itemName);
            
        }

        return list;
    }
    
    public static String getBrand(String itemNameInput) throws FileNotFoundException {
        //output
        String brandReturn = "";

        //create file and file scanner
        File f = new File("items.txt");
        Scanner scFile = new Scanner(f);

        //loop each line
        while (scFile.hasNext()) {

            //line and line scanner
            String line = scFile.nextLine();
            Scanner scLine = new Scanner(line).useDelimiter("#");

            //tokenization
            String itemName = scLine.next();
            String brandName = scLine.next();
            int price = scLine.nextInt();
            String storageLocation = scLine.next();
            int productStock = scLine.nextInt();

            //test
            if (itemName.equals(itemNameInput)) {
                brandReturn = brandName;
            }

        }
        return brandReturn;

    }
}
