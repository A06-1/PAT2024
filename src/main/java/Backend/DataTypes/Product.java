package Backend.DataTypes;

public class Product {

    String productName;
    String productBrand;
    int productCost;

    public Product(String inPBName, String inPName, int inPC) {
        this.productBrand = inPBName;
        this.productCost = inPC;
        this.productName = inPName;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public int getProductCost() {
        return productCost;
    }

    public String[] row() {
        String[] row = new String[3];
        row[0] = this.productName;
        row[1] = this.productBrand;
        row[2] = this.productCost + "";
        return row;
    }
}
