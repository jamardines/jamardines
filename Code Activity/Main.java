import java.util.ArrayList;
import java.util.Iterator;

// Custom exception classes
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
        int newQuantity = getQuantity() + amount;
        if (newQuantity < 0) {
            throw new InsufficientStockException("Insufficient stock for product: " + getProductName());
        }
        if (newQuantity <= 100) {
            setQuantity(newQuantity);
        } else {
            throw new InvalidQuantityException("Cannot exceed maximum limit of 100 for perishable products.");
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
        System.out.println("\nNon-Perishable Product");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: $" + getPrice());
        System.out.println("Shelf Life: " + shelfLife + " days");
    }

    @Override
    public void updateStock(int amount) {
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
        System.out.println("Product added to inventory: " + product.getProductName() + " successfully.");
    }

    public void removeProduct(String productId) {
        Iterator<Product> iterator = products.iterator();
        boolean productRemoved = false;
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(productId)) {
                iterator.remove();
                System.out.println("Product removed: " + productId + " successfully.");
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

        // Case 1: Value of perishable product
        System.out.println("Case 1: ");
        PerishableProduct perishableProduct = new PerishableProduct("P001", "Milk", 50, 3.50, "2024-12-01");
        perishableProduct.displayInfoProduct();

        // Update stock for perishable product
        perishableProduct.updateStock(30);
        perishableProduct.displayInfoProduct();

        // Add to inventory
        inventory.addProduct(perishableProduct);

        // Case 2: Value of non-perishable product
        System.out.println("Case 2: ");
        NonPerishableProduct nonPerishableProduct = new NonPerishableProduct("N001", "Beef Loaf", 200, 1.25, 365);
        nonPerishableProduct.displayInfoProduct();

        // Update stock for non-perishable
        nonPerishableProduct.updateStock(50);
        nonPerishableProduct.displayInfoProduct();

        // Add to inventory
        inventory.addProduct(nonPerishableProduct);

        // Case 3: Updating stock within limits
        System.out.println("Case 3: ");
        try {
            perishableProduct.updateStock(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Case 4: Exceeding stock limit
        System.out.println("Case 4: ");
        try {
            perishableProduct.updateStock(30); // Exceeds limit
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Case 5: Removing a product
        System.out.println("Case 5: ");
        try {
            inventory.removeProduct("P001");
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }

        // Case 6: Removing more stock than available
        System.out.println("Case 6: ");
        try {
            perishableProduct.updateStock(-60); // Attempting to remove more than available
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }

        // Case 7: Invalid quantity update
        System.out.println("Case 7: ");
        try {
            perishableProduct.updateStock(-10); // Invalid quantity
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
    }
}
