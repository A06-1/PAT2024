package Backend.DataTypes;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

class Product {

    String[] productName = new String[100];
    String[] productBrand = new String[100];
    int[] productCost = new int[100];
    Date[] productExchange = new Date[100];

   
   
   
   
    
    
    public static String[] getProductName(String[] productName) {
        return productName;
    }
    public static String[] getProductBrand(String[] productBrand) {
        return productBrand;
    }
    public static int[] getProductCost(int[] productCost){
        return productCost;
    } 
    public static Date[] getProductExchange(Date[] productExchange){
        return productExchange;
    } 

}
