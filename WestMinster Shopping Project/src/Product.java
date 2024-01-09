import java.io.Serializable;

public abstract class Product implements Serializable {
    private String productID;
    private String name;
    private int NumberOfAvailableItem;
    private double price;
    public static int totalNumberOfProduct;

    public Product(String productID, String name, int NumberOfAvailableItem, double price) {
        this.productID = productID;
        this.name = name;
        this.NumberOfAvailableItem = NumberOfAvailableItem;
        this.price = price;
        totalNumberOfProduct ++;


    }

    public static int getTotalNumberOfProduct() {
        return totalNumberOfProduct;
    }

    public static void setTotalNumberOfProduct(int totalNumberOfProduct) {
        Product.totalNumberOfProduct = totalNumberOfProduct;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfAvailableItem() {
        return NumberOfAvailableItem;
    }

    public void setNumberOfAvailableItem(int NumberOfAvailableItem) {
        this.NumberOfAvailableItem = NumberOfAvailableItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", NumberOfAvailableItem=" + NumberOfAvailableItem +
                ", price=" + price
                ;
    }
}
