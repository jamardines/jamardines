import java.util.*;

public class TestStackArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Size");
        int size = scan.nextInt();
        StackArray stack = new StackArray(size);

        while (true) {
            System.out.println("\n--Stack Array Menu--");
            System.out.println("1. Push an item");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit Program");

            while (!scan.hasNextInt()) {
                scan.next(); 
            }
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                  
                    System.out.println("Push an item:");
                    String pushItem = scan.next();
                    if (stack.push(pushItem)) {
                        System.out.println("Push: " + pushItem);
                    } else {
                        System.out.println("Stack is full.");     
                    }
                    break;

                case 2:
                
                    String poppedValue = stack.pop();
                    if (poppedValue != null) {
                        System.out.println("Pop: " + poppedValue);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

                case 3:
                
                    String peekValue = stack.peek();
                    if (peekValue != null) {
                        System.out.println("Peek top item: " + peekValue);
                    } else { 
                        System.out.println("Stack is empty.");
                    }
                    break;

                case 4:
                
                    stack.display();
                    break;

                case 5:
                
                    System.out.println("Exiting program...");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}