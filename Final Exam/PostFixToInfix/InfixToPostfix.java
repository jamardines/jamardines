import java.util.*;

// Represents a node in the stack
class StackNode {
    String data; // The value stored in the node
    StackNode tail; // Pointer to the next node in the stack (linked list implementation)
    
    // Constructor to initialize the node with data
    public StackNode(String data) {
        this.data = data;
        tail = null;
    }
}

// A stack implemented using a linked list
class StackList {
    private StackNode head; // Points to the top of the stack
    private int count; // Keeps track of the number of elements in the stack
    
    // Constructor to initialize an empty stack
    public StackList() {
        head = null;
        count = 0;
    }
    
    // Checks if the stack is empty
    public boolean isEmpty() {
        return count == 0; // Returns true if the stack has no elements
    }
    
    // Pushes a new element onto the stack
    public boolean push(String data) {
        StackNode node = new StackNode(data); // Create a new node with the given data
        node.tail = head; // Link the new node to the current top of the stack
        head = node; // Update the head to the new node
        count++; // Increment the count of elements
        return true; // Return true to indicate success
    }
    
    // Pops the top element from the stack
    public String pop() {
        if (!isEmpty()) { // If the stack is not empty
            String popped = head.data; // Get the data from the top node
            head = head.tail; // Move the head to the next node
            count--; // Decrement the count of elements
            return popped; // Return the popped value
        }
        return null; // Return null if the stack is empty
    }
    
    // Peeks at the top element without removing it
    public String peek() {
        if (!isEmpty()) { // If the stack is not empty
            return head.data; // Return the data at the top of the stack
        }
        return null; // Return null if the stack is empty
    }
    
    // Returns the number of elements in the stack
    public int getCount() {
        return count; // Return the count of elements
    }
    
    // Displays all elements in the stack
    public void display() {
        if (!isEmpty()) { // If the stack is not empty
            StackNode temp = head; // Start from the top of the stack
            while (temp != null) { // Traverse the stack
                System.out.println(temp.data); // Print each element
                temp = temp.tail; // Move to the next element
            }
            System.out.println();
        } else { // If the stack is empty
            System.out.println("Stack is empty...."); // Print an empty message
        }
    }
}

// Converts an infix expression to a postfix expression
public class InfixToPostfix {
    private String infix; // The infix expression to be converted
    
    // Constructor to initialize the infix expression
    public InfixToPostfix(String i) {
        infix = i;
    }
    
    // Determines the precedence of operators
    private int getPrec(char o) {
        if (o == '*' || o == '/') // '*' and '/' have the highest precedence
            return 2;
        if (o == '+' || o == '-') // '+' and '-' have lower precedence
            return 1;
        return -1; // Return -1 for non-operators
    }
    
    // Converts the infix expression to a postfix expression
    public String convert() {
        StackList s = new StackList(); // Create a stack to hold operators
        String result = ""; // Initialize the result as an empty string
        
        for (int i = 0; i < infix.length(); i++) { // Traverse the infix expression
            char c = infix.charAt(i); // Get the current character
            
            if (Character.isDigit(c)) { // If the character is an operand (number)
                result += c; // Append it to the result
            } else if (c == '(') { // If the character is an opening parenthesis
                s.push(c + ""); // Push it onto the stack
            } else if (c == ')') { // If the character is a closing parenthesis
                while (!s.peek().equals("(")) { // Pop and append until an opening parenthesis is found
                    result += s.pop();
                }
                s.pop(); // Remove the opening parenthesis from the stack
            } else { // If the character is an operator
                // Pop and append operators from the stack while they have higher or equal precedence
                while (!s.isEmpty() && (getPrec(c) <= getPrec(s.peek().charAt(0)))) {
                    result += s.pop();
                }
                s.push(c + ""); // Push the current operator onto the stack
            }
        }
        
        // Append any remaining operators in the stack to the result
        while (!s.isEmpty()) {
            result += s.pop();
        }
        
        return result; // Return the postfix expression
    }
}