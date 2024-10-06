import java.util.ArrayList;

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
        System.out.println("\nNon-Perishable Product");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: $" + getPrice());
        System.out.println("Shelf Life: " + shelfLife + " days");
    }

    @Override
    public void updateStock(int amount) {
        setQuantity(getQuantity() + amount);    
    }
}

class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added to inventory: " + product.getProductName());
    }
    
    public void removeProduct(String productId) {
        for(Product product : products) {   
            if(product.getProductId().equals(productId)) {
                products.remove(product);
                System.out.println("Product Remove " + productId);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // inventory instance
        Inventory inventory = new Inventory();

        // value of perishable
        PerishableProduct perishableProduct = new PerishableProduct("P001", "Milk", 50, 3.50, "2024-12-01");
        perishableProduct.displayInfoProduct();
        
        // update stock for perishable product
        perishableProduct.updateStock(30);
        perishableProduct.displayInfoProduct();
        
        // to add inventory
        inventory.addProduct(perishableProduct);
        
        // value of  non perishable 
        NonPerishableProduct nonPerishableProduct = new NonPerishableProduct("N001", "Beed Loaf", 200, 1.25, 365);
        nonPerishableProduct.displayInfoProduct();
        
        // update stock for non perishable 
        nonPerishableProduct.updateStock(50);
        nonPerishableProduct.displayInfoProduct();
        
        // to add inventory
        inventory.addProduct(nonPerishableProduct);
    }
}
