class StackArray {
    private String[] s;
    private int count;

    public StackArray(int size) {
        s = new String[size];
        count = 0;
    }

    public StackArray() {
        this(10);
    }

    private boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {
        return count == s.length;
    }

    public boolean push(String val) {
        if (!isFull()) {
            s[count++] = val;
            return true;
        } else {
            return false;
        }
    }

    public String pop() {
        if (!isEmpty()) {
            return s[--count];
        }
        return null; 
    }

    public String peek() {
        if (!isEmpty()) {
            return s[count - 1]; 
        }
        return null; 
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i < count; i++) {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}
