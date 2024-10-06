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
        System.out.println("\nGeneric Product");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: $" + getPrice());
    }

    public void updateStock(int amount) {
        setQuantity(getQuantity() + amount);
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

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new PerishableProduct("P001", "Milk", 50, 3.50, "2024-12-01");
        products[1] = new NonPerishableProduct("NP001", "Canned Beans", 200, 1.25, 365);

        for (Product product : products) {
            product.displayInfoProduct();
            product.updateStock(20);
            product.displayInfoProduct();
        }
    }
}
