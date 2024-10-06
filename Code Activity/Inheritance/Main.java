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
}

public class Main {
   public static void main(String[] args) {

      String perishableId = "P001";
      String perishableName = "Milk";
      int perishableQuantity = 20;
      double perishablePrice = 2.99;
      String expirationDate = "2024-12-01";

      PerishableProduct perishableProduct = new PerishableProduct(perishableId, perishableName, perishableQuantity, perishablePrice, expirationDate);
      perishableProduct.displayInfoProduct();

      String nonPerishableId = "NP001";
      String nonPerishableName = "Corn Beef";
      int nonPerishableQuantity = 100;
      double nonPerishablePrice = 1.99;
      int shelfLife = 365;

      NonPerishableProduct nonPerishableProduct = new NonPerishableProduct(nonPerishableId, nonPerishableName, nonPerishableQuantity, nonPerishablePrice, shelfLife);
      nonPerishableProduct.displayInfoProduct();
   }
}
