import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WestminsterShoppingManager implements ShoppingManager {
    private static Scanner obj = new Scanner(System.in);
    private static ArrayList<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        WestminsterShoppingManager classObj = new WestminsterShoppingManager();
        classObj.selectOption();




    }
    public void selectOption(){
        int choice;
        do{
            choice = displayManu();
            switch(choice){
                case(1):
                    addProduct();
                    break;
                case(2):
                    deleteProduct();
                    break;
                case(3):
                    printProductList();
                    break;
                case(4):
                    saveToFile();
                    break;
                case(5):
                    loadFromFile();
                    break;
                case(6):
                    break;
                default:
                    System.out.println("invalid choice");
            }}while(choice != 6);
    }
    public  int displayManu(){
        System.out.println("     WestminsterShoppingManager     ");
        System.out.println("     1. Add product");
        System.out.println("     2. Delete product");
        System.out.println("     3. print list of products");
        System.out.println("     4. saveToFile");
        System.out.println("     5. loadFromFile");
        System.out.println("     6. exit");


        System.out.println("Enter your choice");
        int choice = obj.nextInt();
        return choice ;

    }
    public  void addProduct(){

        System.out.println("if product is electronic enter 1 , clothing enter 2");
        int productType = obj.nextInt();
        obj.nextLine();

        System.out.println("enter productID");
        String productID = obj.nextLine();
        System.out.println("enter product name");
        String name = obj.nextLine();
        System.out.println("enter number of aviable items");
        int NumberOfAvailableItem = obj.nextInt();
        System.out.println("enter price");
        double price = obj.nextDouble();

        if(productType == 1){
            System.out.println("enter warranty period (in months)");
            int warranttyPeriod = obj.nextInt();
            obj.nextLine();
            System.out.println("enter brand of your electronic item");
            String brand = obj.nextLine();
            Product product = new Electronics(brand, warranttyPeriod, productID, name, NumberOfAvailableItem, price);
            productList.add(product);
        }
        else if(productType == 2)
        {

            System.out.println("enter cloth size");
            String size = obj.nextLine();
            obj.nextLine();
            System.out.println("enter cloth colour");
            String colour = obj.nextLine();
            Product product = new Clothing(size, colour, productID, name, NumberOfAvailableItem, price);
            productList.add(product);
        }

    }

    public  void deleteProduct()
    {
        System.out.println("enter productID that you what to delete");
        String productID = obj.nextLine();
        obj.nextLine();

        for(int i = 0; i < productList.size();i++) {
            if(productID.equals(productList.get(i).getProductID()))
            {
                productList.remove(i);
                break;
            }}
    }
    public  void printProductList()
    {
        if (productList.isEmpty()) {
            System.out.println("Product list is empty.");
        } else {
            System.out.println("Product list:");
            for (Product product : productList) {
                System.out.println(product.toString());
            }
        }
    }

    public  void saveToFile() {
        try (FileOutputStream fileOut = new FileOutputStream("productList.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(productList);
            System.out.println("Product list saved to file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void loadFromFile() {
        try (FileInputStream fileIn = new FileInputStream("productList.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            productList = (ArrayList<Product>) objectIn.readObject();
            System.out.println("Product list loaded from file.");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}






