import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of change due (in cents):");
        int changeDue = scanner.nextInt();

        int dollars = changeDue / 100;
        int remainingCents = changeDue % 100;

        int quarters = remainingCents / 25;
        remainingCents %= 25;

        int dimes = remainingCents / 10;
        remainingCents %= 10;

        int nickels = remainingCents / 5;
        remainingCents %= 5;

        int pennies = remainingCents;

        System.out.println("Your change is: " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");

        scanner.close();
    }
}
