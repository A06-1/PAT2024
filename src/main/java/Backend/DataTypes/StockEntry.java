package Backend.DataTypes;

import java.time.LocalDate;

public class StockEntry {

    private String productName;
    private LocalDate stockingDate;
    private int quantity;//+ or - 

    public StockEntry(String inPN, LocalDate inSD, int inQ) {
        this.productName = inPN;
        this.stockingDate = inSD;
        this.quantity = inQ;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getStockingDate() {
        return stockingDate;
    }

    public void setStockingDate(LocalDate stockingDate) {
        this.stockingDate = stockingDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    } 
    
    

}
