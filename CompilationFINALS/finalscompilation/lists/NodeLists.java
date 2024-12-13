package finalscompilation.lists;



public class NodeLists {
   private Node head;
   private int count;
   
   public NodeLists() {
      head = null;
      count = 0;
   }
   
   public boolean add(Node item) {
      if (head == null) {
         head = item;
      } else {
         Node curr = head;
         while (curr.next != null) {
            curr = curr.next;
         }
         curr.next = item;
      }
      count++;
      return true;
   }
   
   public boolean delete(int location) {
      if (isEmpty() || location < 0 || location >= count) {
         return false;
      }
      
      if (location == 0) {
         head = head.next;
      } else {
         Node curr = head;
         for (int i = 0; i < location - 1; i++) {
            curr = curr.next;
         }
         if (curr.next != null) {
            curr.next = curr.next.next;
         }
      }
      count--;
      return true;
   }
   
   public void display() {
    Node curr = head;
    if (!isEmpty()) {
        System.out.println("List:");
        int index = 0;
        while (curr != null) {
            System.out.println("[" + index + "] " + curr.data);
            curr = curr.next;
            index++;
        }
    } else {
        System.out.println("List is Empty");
    }
}

   
   private boolean isEmpty() {
      return count == 0;
   }
}