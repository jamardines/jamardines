
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
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean push(String data) {
        StackNode node = new StackNode(data);
        node.tail = head;
        head = node;
        count++;
        return true;
    }
    
    public String pop() {
        if (!isEmpty()) {
            String popped = head.data;
            head = head.tail;
            count--;
            return popped;
        }
        return null;
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

public class InfixToPostfix {
    private String infix;
    
    public InfixToPostfix(String i) {
        infix = i;
    }
    
    private int getPrec(char o) {
        if (o == '*' || o == '/') 
            return 2;
        if (o == '+' || o == '-') 
            return 1;
        return -1;
    }
    
    public String convert() {
        StackList s = new StackList();
        String result = "";
        
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            
            if (Character.isDigit(c)) {
                result += c;
            } else if (c == '(') {
                s.push(c + "");
            } else if (c == ')') {
                while (!s.peek().equals("(")) {
                    result += s.pop();
                }
                s.pop();
            } else {
                while (!s.isEmpty() && (getPrec(c) <= getPrec(s.peek().charAt(0)))) {
                    result += s.pop();
                }
                s.push(c + "");
            }
        }
        
        while (!s.isEmpty()) {
            result += s.pop();
        }
        
        return result;
    }
}
