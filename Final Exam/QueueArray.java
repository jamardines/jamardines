
import java.util.*;

public class QueueArray {
    private Object[] items;
    private int count;

    public QueueArray(int size) {
        items = new Object[size];
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public boolean enqueue(Object val) {
        if (!isFull()) {
            items[count++] = val;
            return true;
        }
        return false;
    }

    public boolean dequeue() {
        if (!isEmpty()) {
            for (int i = 1; i < count; i++) {
                items[i - 1] = items[i];
            }
            items[count - 1] = null;
            count--;
            return true;
        }
        return false;
    }

    public Object front() {
        if (!isEmpty()) {
            return items[0];
        }
        return null;
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                System.out.println("[" + items[i] + "]");
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty...");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QueueArray qa = new QueueArray(5);
        int choice;

        do {
            System.out.println("Select [1] to enQueue item: ");
            System.out.println("Select [2] to deQueue item: ");
            System.out.println("Select [3] to Display items: ");
            System.out.println("Select [4] to Display front item: ");
            System.out.println("Select [0] to Exit: ");

            while (!scan.hasNextInt()) {
                System.out.println("Invalid Input!");
                scan.nextLine();
            }

            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    if (qa.isFull()) {
                        System.out.println("Queue is full!");
                    } else {
                        System.out.println("Enter item to enQueue: ");
                        int enqueue = scan.nextInt();
                        qa.enqueue(enqueue);
                    }
                    break;
                case 2:
                    if (qa.dequeue()) {
                        System.out.println("Item Dequeued");
                    } else {
                        System.out.println("Queue is Empty!");
                    }
                    break;
                case 3:
                    qa.display();
                    break;
                case 4:
                    Object frontItem = qa.front();
                    if (frontItem != null) {
                        System.out.println("Front item: [" + frontItem + "]");
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select again.");
                    break;
            }

        } while (choice != 0);
        
    }
}