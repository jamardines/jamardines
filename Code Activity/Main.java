import java.util.ArrayList;
import java.util.Iterator;

class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(String message) {
        super(message);
    }
}

class InvalidQuantityException extends RuntimeException {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

abstract class Product {
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

    public abstract void displayInfoProduct();

    public abstract void updateStock(int amount);
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
        System.out.println("\nPerishable Product");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: $" + getPrice());
        System.out.println("Expiration Date: " + expirationDate);
    }

    @Override
    public void updateStock(int amount) {
        if (amount < 0) throw new InvalidQuantityException("Quantity cannot be negative.");
        int newQuantity = getQuantity() + amount;
        if (newQuantity > 100) {
            throw new InvalidQuantityException("Cannot exceed maximum limit of 100 for perishable products.\n");
        }
        setQuantity(newQuantity);
    }

    public void removeStock(int amount) {
        if (amount < 0) throw new InvalidQuantityException("Quantity cannot be negative.");
        int newQuantity = getQuantity() - amount;
        if (newQuantity < 0) {
            throw new InsufficientStockException("Insufficient stock for product: " + getProductName()+ ". Attempted to remove " + amount + " but only " + getQuantity() +  " availbale.\n"   );
        }
        setQuantity(newQuantity);
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
        System.out.println("\nNon-Perishable Product");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: $" + getPrice());
        System.out.println("Shelf Life: " + shelfLife + " days");
    }

    @Override
    public void updateStock(int amount) {
        if (amount < 0) throw new InvalidQuantityException("Quantity cannot be negative.");
        int newQuantity = getQuantity() + amount;
        if (newQuantity < 0) {
            throw new InsufficientStockException("Insufficient stock for product: " + getProductName());
        }
        setQuantity(newQuantity);
    }
}

class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getProductName() + " with quantity " + product.getQuantity() + "\n");
    }

    public void removeProduct(String productId) {
        boolean productRemoved = false;
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getProductId().equals(productId)) {
                products.remove(i);
                System.out.println("Product removed: " + productId + " successfully.\n");
                productRemoved = true;
                break; 
            }
        }
        if (!productRemoved) {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        System.out.println("Case 1: ");
        PerishableProduct apple = new PerishableProduct("P001", "Apple", 50, 0.5, "2024-12-31");
        inventory.addProduct(apple);

        System.out.println("Case 2: ");
        NonPerishableProduct rice = new NonPerishableProduct("NP001", "Rice", 200, 1.0, 365);
        inventory.addProduct(rice);

        System.out.println("Case 3: ");
        try {
            apple.updateStock(90);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            apple.updateStock(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Case 4: ");
        try {
            apple.removeStock(80);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Case 5: ");
        inventory.removeProduct("P001");

        System.out.println("Case 6: \n");
        try {
            apple.removeStock(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Case 7: ");
        try {
            apple.updateStock(-10);
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
    }
}
