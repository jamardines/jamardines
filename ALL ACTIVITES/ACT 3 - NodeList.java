import java.util.Scanner;

class StackNode {
    String data;
    StackNode tail;
    
    public StackNode(String data) {
        this.data = data;
        tail = null;
    }
}

class StackList {
    private StackNode head;
    private int count;
    
    public StackList() {
        head = null;
        count = 0;
    }
    
    private boolean isEmpty() {
        return count == 0;
    }
    
    public boolean push(String data) {
        StackNode node = new StackNode(data);
        node.tail = head;
        head = node;
        count++;
        return true;
    }
    
    public boolean pop() {
        if (!isEmpty()) {
            head = head.tail;
            count--;
            return true;
        }
        return false;
    }
    
    public String peek() {
        if (!isEmpty()) {
            return head.data;
        }
        return null;
    }
    
    public int getCount() {
        return count;
    }
    
    public void display() {
        if (!isEmpty()) {
            StackNode temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.tail;
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty....");
        }
    }
}

public class StackMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackList stack = new StackList();
        String choice;
        
        do {
            System.out.println("\nStack Menu:");
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Peek the top element");
            System.out.println("4. Display the stack");
            System.out.println("5. Check if the stack is empty");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter element to push: ");
                    String element = scanner.nextLine();
                    stack.push(element);
                    System.out.println("Element pushed: " + element);
                    break;
                    
                case "2":
                    if (stack.pop()) {
                        System.out.println("Element popped.");
                    } else {
                        System.out.println("Stack is empty, cannot pop.");
                    }
                    break;
                    
                case "3":
                    String topElement = stack.peek();
                    if (topElement != null) {
                        System.out.println("Top element: " + topElement);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                    
                case "4":
                    stack.display();
                    break;
                    
                case "5":
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                    
                case "6":
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (!choice.equals("6"));
        
        scanner.close();
    }
}
