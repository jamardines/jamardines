
import java.util.Scanner;

public class ImprovedSquareRootProgram {
    public static void main(String[] args) {
        Scanner scanner;
        String response;

        do {
            scanner = new Scanner(System.in); 

            double number;
            do {
                System.out.print("Enter a number--> ");
                while (!scanner.hasNextDouble()) {
                    System.out.println(">>>Please enter a valid number<<<");
                    System.out.print("Enter a number--> ");
                    scanner.next(); 
                }
                number = scanner.nextDouble();
                if (number <= 0) {
                    System.out.println(">>>Number must be positive<<<");
                }
            } while (number <= 0);

            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + squareRoot);

            do {
                System.out.print("Do you wish to continue (yes or no)? ");
                response = scanner.next().toLowerCase();
                if (!response.equals("yes") && !response.equals("no")) {
                    System.out.println(">>>Please respond with (yes or no)<<<");
                }
            } while (!response.equals("yes") && !response.equals("no"));

        } while (response.equals("yes"));

        System.out.println("Bye");
    }
}
