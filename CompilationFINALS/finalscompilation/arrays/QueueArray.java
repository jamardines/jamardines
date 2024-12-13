package finalscompilation.arrays;

public class QueueArray {
   private Object[] items;
   private int count;
   
   public QueueArray (int size) {
      items = new Object[size];
      count = 0;
   }

   public QueueArray () {
      this(10);
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
         for (int i = 0; i < count; i++) {
            items[i] = items[i+1];
         }
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
            System.out.print("["+items[i]+"]");
            System.out.print(" <-- ");
         }
         System.out.println();
      } else {
         System.out.println("Queue is empty...");
      }
   }
}