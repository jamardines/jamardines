import java.util.Scanner;

public class OrderChecker {
    public static void main(String[]args)
    {

        final int BOLT_PRICE = 5;
        final int NUT_PRICE = 3;
        final int WASHER_PRICE = 1;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Number of bolts: ");

        int bolt = scan.nextInt();

        System.out.printf("Number of nuts: ");
        int nuts = scan.nextInt();

        System.out.printf("Number of washer: ");
        int washer = scan.nextInt();

        int totalCost = (bolt * BOLT_PRICE) + (nuts * NUT_PRICE) + (washer * WASHER_PRICE);

        if (nuts < bolt) {
            System.out.println("Check the Order: too few nuts");
        }
        if (washer < ( 2 * bolt)) {
            System.out.println("Check the Order: too few washers");
        }
        if (nuts >= bolt && washer >= (2 * bolt)){
        System.out.println("Order is OK.");
        }

        System.out.println("\nTotal Cost: " + totalCost);
    }
}
