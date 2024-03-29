import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the item: ");
        String item = scanner.nextLine();

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();

        System.out.print("Overnight delivery (0==no, 1==yes): ");
        int express = scanner.nextInt();

        double deliveryPrice = calculateDeliveryPrice(price, express == 1);
        double totalPrice = price + deliveryPrice;

        System.out.println("\nInvoice:");
        System.out.printf("  %-13s %.2f\n", item, price);
        System.out.printf("  %-13s %.2f\n", "delivery", deliveryPrice);
        System.out.printf("  %-13s %.2f\n", "total", totalPrice);

    }

        public static double calculateDeliveryPrice(double price, boolean express) {
        if (price >= 10.00) {
            return 0.00;
        } 
        else if (express) {
            return 5.00;
        } 
        else
        {
            return 2.00;
        }
    }
}
