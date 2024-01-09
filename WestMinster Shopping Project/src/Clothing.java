public class Clothing extends Product {
    private String size;
    private String Colour;

    public Clothing(String size, String Colour, String productID, String name, int NumberOfAvailableItem, double price) {
        super(productID, name, NumberOfAvailableItem, price);
        this.size = size;
        this.Colour = Colour;
        System.out.println("clothing product added");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    @Override
    public String toString() {
        return "Clothing" +
                "size='" + size + '\'' +
                ", Colour='" + Colour + '\''
                ;
    }
}
