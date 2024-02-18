import java.util.Scanner;

public class CenttoDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the cents:");
        int cents = scanner.nextInt();

        int dollars = cents / 100; 
        int remainingCents = cents % 100; 

        System.out.println("That is " + dollars + " dollars and " + remainingCents + " cents.");

    }
}
