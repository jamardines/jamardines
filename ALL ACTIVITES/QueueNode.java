import java.util.*;

class Node {
    Object value;
    Node next;

    public Node(Object value) {
        this.value = value;
        next = null;
    }
}

public class QueueNode {
    Node first;
    Node last;
    int count;

    public QueueNode() {
        first = null;
        last = null;
        count = 0;
    }

    public boolean isEmpty() {
        return first == null && last == null;
    }

    public boolean enqueue(Object value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        count++;
        return true;
    }

    public boolean dequeue() {
        if (!isEmpty()) {
            if (first == last) {
                first = null;
                last = null;
            } else {
                first = first.next;
            }

            count--;
            return true;
        } else {
            return false;

        }
    }

    public Object getFirst() {
        if (!isEmpty()) {
            return first.value;
        } else {
            return null;
        }
    }

    public Object getLast() {
        if (!isEmpty()) {
            return last.value;
        } else {
            return null;
        }
    }

    public void display() {
        if (!isEmpty()) {
            Node temporary = first;
            System.out.print("Queue contents: ");
            while (temporary != null) {
                System.out.print("[" + temporary.value + "] -> ");
                temporary = temporary.next;
            }
            System.out.println("null");
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public static void main(String[] args) {
        QueueNode qn = new QueueNode();
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nQueue Menu:");
            System.out.println("Select [1] to Enqueue");
            System.out.println("Select [2] to Dequeue");
            System.out.println("Select [3] to Display");
            System.out.println("Select [4] to get First Element");
            System.out.println("Select [5] to get Last Element");
            System.out.println("Select [6] to Exit");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    Object value = scan.next();
                    qn.enqueue(value);
                    System.out.println("Enqueued: " + value);
                    break;

                case 2:
                    qn.dequeue();
                    break;

                case 3:
                    qn.display();
                    break;

                case 4:
                    Object first = qn.getFirst();
                    if (first != null) {
                        System.out.println("First element: " + first);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 5:
                    Object last = qn.getLast();
                    if (last != null) {
                        System.out.println("Last element: " + last);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

    }
}
