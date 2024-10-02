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

   public void displayInfo() {
      System.out.println("\nProduct ID: " + productId);
      System.out.println("Product Name: " + productName);
      System.out.println("Quantity: " + quantity);
      System.out.println("Price: $" + price);
   }
} 

public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter product details: ");
      System.out.print("Product ID: ");
      String productId = scan.nextLine();
      
      System.out.print("Product Name: ");
      String productName = scan.nextLine();
      
      System.out.print("Product Quantity: ");
      int quantity = scan.nextInt();
      
      System.out.print("Product Price: ");
      double price = scan.nextDouble();
      
      Product product = new Product(productId, productName, quantity, price);
      product.displayInfo();
      
   }
}
