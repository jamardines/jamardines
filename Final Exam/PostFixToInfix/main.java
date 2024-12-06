import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Infix to Postfix Menu:");
            System.out.println("1. Convert infix to postfix");
            System.out.println("2. Evaluate postfix expression");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter an infix expression: ");
                    String infix = scanner.nextLine();
                    InfixToPostfix converter = new InfixToPostfix(infix);
                    String postfix = converter.convert();
                    System.out.println("Postfix expression: " + postfix);
                    break;

                case "2":
                    System.out.print("Enter a postfix expression: ");
                    String postfixInput = scanner.nextLine();
                    Evaluate evaluator = new Evaluate(postfixInput);
                    double result = evaluator.getResult();
                    System.out.println("Result: " + result);
                    break;

                case "3":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println();
        } while (!choice.equals("3"));

        scanner.close();
    }
}