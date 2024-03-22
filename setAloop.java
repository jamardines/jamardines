import java.util.Scanner;

public class setAloop {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("Enter an integer between 0 and 35: ");
            int number = scan.nextInt();
            scan.nextLine(); 

            if (number >= 0 && number <= 9) {
                System.out.println(number);
            } 

            else if (number >= 10 && number <= 35) {
                char letter = (char) (number - 10 + 'A');
                System.out.println(letter);
            } 
            else
            {
                System.out.println("Invalid input. Please enter a number between 0 and 35.");
                continue; 
            }
            
            do {
                System.out.print("Try another number? (yes/no): ");
                userInput = scan.nextLine().toLowerCase(); 

                if (!(userInput.equals("yes") || userInput.equals("no"))) {
                    System.out.println("Invalid Input");

                }

            } while (!(userInput.equals("yes") || userInput.equals("no"))); 
            
        } while (!userInput.equals("no"));
    }
}
