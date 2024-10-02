import java.util.*;

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void displayInfoProduct() {
        System.out.println("\nProduct ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
    }

    public void updateStock(int amount) {
        setQuantity(quantity + amount);
    }
}

class PerishableProduct extends Product {
    private String expirationDate;

    public PerishableProduct(String productId, String productName, int quantity, double price, String expirationDate) {
        super(productId, productName, quantity, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public void displayInfoProduct() {
        super.displayInfoProduct();
        System.out.println("Expiration Date: " + expirationDate);
    }

    @Override
    public void updateStock(int amount) {
        int newQuantity = getQuantity() + amount;
        if (newQuantity <= 100) {
            setQuantity(newQuantity);
        } else {
            System.out.println("Cannot exceed maximum limit of 100 for perishable products.");
        }
    }
}

class NonPerishableProduct extends Product {
    private int shelfLife;

    public NonPerishableProduct(String productId, String productName, int quantity, double price, int shelfLife) {
        super(productId, productName, quantity, price);
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    @Override
    public void displayInfoProduct() {
        super.displayInfoProduct();
        System.out.println("Shelf Life: " + shelfLife + " days");
    }

    @Override
    public void updateStock(int amount) {
        setQuantity(getQuantity() + amount);    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter details for a Perishable Product: ");
        System.out.print("Product ID: ");
        String perishableId = scan.nextLine();

        System.out.print("Product Name: ");
        String perishableName = scan.nextLine();

        System.out.print("Product Quantity: ");
        int perishableQuantity = scan.nextInt();

        System.out.print("Product Price: ");
        double perishablePrice = scan.nextDouble();
        scan.nextLine();
        
        System.out.print("Expiration Date (YYYY-MM-DD): ");
        String expirationDate = scan.nextLine();
        
        PerishableProduct perishableProduct = new PerishableProduct(perishableId, perishableName, perishableQuantity, perishablePrice, expirationDate);
        perishableProduct.displayInfoProduct();
        
        //**********************************************************//
        System.out.print("\nEnter amount to update stock for Perishable Product: ");
        int perishableUpdateAmount = scan.nextInt();
        
        perishableProduct.updateStock(perishableUpdateAmount);
        perishableProduct.displayInfoProduct();
        
        System.out.println("\nEnter details for a Non-Perishable Product: ");
        System.out.print("Product ID: ");
        String nonPerishableId = scan.nextLine();
        
        System.out.print("Product Name: ");
        String nonPerishableName = scan.nextLine();
        
        System.out.print("Product Quantity: ");
        int nonPerishableQuantity = scan.nextInt();
        
        System.out.print("Product Price: ");
        double nonPerishablePrice = scan.nextDouble();
        
        System.out.print("Shelf Life (in days): ");
        int shelfLife = scan.nextInt();
        
        NonPerishableProduct nonPerishableProduct = new NonPerishableProduct(nonPerishableId, nonPerishableName, nonPerishableQuantity, nonPerishablePrice, shelfLife);
        nonPerishableProduct.displayInfoProduct();
        
      
        System.out.print("Enter amount to update stock for Non-Perishable Product: ");
        int nonPerishableUpdateAmount = scan.nextInt();
        
        nonPerishableProduct.updateStock(nonPerishableUpdateAmount);
        nonPerishableProduct.displayInfoProduct();
  
       
    }
}
