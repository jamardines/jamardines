import java.util.Scanner;

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
   
   public boolean enqueue(Object value) {
      if (!isFull()) {
         items[count++] = value;
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
      return null;  // Return null if the queue is empty
   }
   
   public void display() {
      if (!isEmpty()) {
         for (int i = 0; i < count; i++) {
            System.out.println("[" + items[i] + "]");
         }
         System.out.println();
      } else {
         System.out.println("Queue is Empty...");
      }
   }

   public static void main(String[] args) {
      QueueArray qa = new QueueArray(5);
      Scanner scann = new Scanner(System.in);
      int choice;
      
      do {
         System.out.println("\n[Welcome to Queue Menu]");
         System.out.println(" Press [1] to Enqueue");
         System.out.println(" Press [2] to Dequeue");
         System.out.println(" Press [3] to Front");
         System.out.println(" Press [4] to Display Queue");
         System.out.println(" Press [5] to Exit");
         System.out.print(" Enter your Choice: ");
         choice = scann.nextInt();
         
         switch (choice) {
            case 1: 
               System.out.println(" Enter Item to Enqueue: ");
               Object value = scann.next();
               if (qa.enqueue(value)) {
                  System.out.println(" Enqueued: " + "[" + value + "]");
               } else {
                  System.out.println(" Queue is Full");
               }
               break;
            case 2:
               if (qa.dequeue()) {
                  System.out.println(" Item Dequeued");
               } else {
                  System.out.println(" Queue is Empty");
               }
               break;
            case 3:
               if (!qa.isEmpty()) {
                  System.out.println("Front of Queue: " + qa.front());
               } else {
                  System.out.println(" Queue is Empty");
               }
               break;
            case 4:
               qa.display();
               break;
            case 5:
               System.out.println(" Exited Program");
               break;
            default:
               System.out.println("Invalid choice! Please select again.");
               break;
         }
      } while (choice != 5);
   }
}
