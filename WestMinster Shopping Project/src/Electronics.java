public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(String brand, int warrantyPeriod, String productID, String name, int NumberOfAvailableItem, double price) {
        super(productID, name, NumberOfAvailableItem, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
        System.out.println("electronic product added");
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return "Electronics" +
                "brand='" + brand + '\'' +
                ", warrantyPeriod=" + warrantyPeriod ;
    }
}