package finalscompilation.lists;

class QueueNode
{
   Object value;
   QueueNode next;
   
   public QueueNode(Object value)
   {
      this.value = value;
      next = null;
   }
}

public class QueueList 
{
   QueueNode first;
   QueueNode last;
   int count;
   
   public QueueList()
   {
      first = null;
      last = null;
      count = 0;
   }
   
   public boolean isEmpty()
   {
      return first == null && last == null;
      //return count == 0;
   }
   
   public boolean enqueue(Object value)
   {
      QueueNode newNode = new QueueNode(value);
      if(isEmpty())
      {
         //first = last = newNode;
         first = newNode;
         last = newNode;
      }
      else 
      {
         last.next = newNode;
         last = newNode;
      }
      count++;
      return true;
   }
   
   public boolean dequeue()
   {
      if(!isEmpty())
      {
         if(first == last)
         {
            first = null;
            last = null;
         }
         else 
         {
            first = first.next;
         }
         count--;
         return true;
      }
      else
         return false;
   }
   
   public Object getFirst()
   {
      if(!isEmpty())
         return first.value;      
      else
         return null;
   }
   
   public Object getLast()
   {
      if(!isEmpty())
         return last.value;
      else
         return null;
   }
   
   
   //toString
   public String toString()
   {
      String result = "";
      if(!isEmpty())
      {
         result += "first = [" + first.value + "]\n";
         result += "last  = [" + last.value + "]\n";
      
         QueueNode temporary = first;
         while(temporary != null)
         {
            result += "[" + temporary.value + "]->";
            temporary = temporary.next;
         }
         result += "\n";
      }
      
      return result;
   }
   
   public void display()
   {
      if(!isEmpty())
      {
         QueueNode temporary = first;
         while(temporary != null)
         {
            System.out.print("[" + temporary.value + "]->");
            temporary = temporary.next;
         }
         System.out.println();
      }  
      else
         System.out.println("Queue is empty...");
   }
   
   public static void main(String[] args)
   {
      QueueList qn = new QueueList();
      qn.enqueue(7);
      qn.enqueue(2);
      qn.enqueue(4);
      qn.enqueue(10);
      System.out.println(qn); //it implicitly calls the toString function in your QueueNode class
      qn.display();
      /*

      qn.dequeue();
      qn.display();     
      qn.dequeue();
      qn.dequeue();
      qn.dequeue();
      qn.display();     
      qn.enqueue(1);
      qn.enqueue(2);
      qn.enqueue(3);
      qn.enqueue(4);      
      qn.enqueue(5);    
      qn.display();   
      qn.dequeue();
      qn.dequeue();
      qn.dequeue();                
      qn.dequeue();      
      qn.display();    
      */              
   }
}