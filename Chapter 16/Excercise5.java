import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Is it raining? (Y or N): ");
        String input = scan.next(); // Reading user input as a string

        if (input.equals("Y") || input.equals("y")) {
            System.out.println("Wipers on");
        } else {
            System.out.println("Wipers off");
        }
        
    }
}
