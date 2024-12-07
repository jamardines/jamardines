import java.util.*;

public class ACT1 {
   public static void main(String[]args) {
      Scanner scan = new Scanner (System.in);
      
      int sum = 0;
      int product = 1;
      int count = 0;
      
      
      while(count < 5) {
         System.out.println("Enter an integer number: ");
         int number = scan.nextInt();
         
         if(number > 0) {
            sum += number;
            product *= number;
         }
         
         count++;
      }
      System.out.println("Total sum of positive number: " + sum);
      System.out.println("Product of positive number: " + product);
   }
}