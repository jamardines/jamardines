import java.util.Scanner;

public class DiscountPrices {
    public static void main(String[]args)
    {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of purchases: ");
        int amountp = scan.nextInt();

        if (amountp > 1000) {
            int discount = amountp / 10;
            int DiscountPrices = amountp - discount;
            System.out.println("Discount prices: " + DiscountPrices);

        } else {
            System.out.println("No discount. Purchase is less than ($10.00)");

        }
        

    }
}
