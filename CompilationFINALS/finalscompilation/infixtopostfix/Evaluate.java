package finalscompilation.infixtopostfix;

import finalscompilation.lists.StackList;

public class Evaluate {
   private String postfix;
   
   public Evaluate(String postfix) {
      this.postfix = postfix;
   }
   
   public double getResult() {
      StackList s = new StackList();
      double ans = 0;
      
      for (int i = 0; i < postfix.length(); i++) {
         char c = postfix.charAt(i);
         
         if (Character.isDigit(c)) {
            s.push(c+"");
         } else {
            double val2 = Double.parseDouble(s.pop());
            double val1 = Double.parseDouble(s.pop());
            
            switch (c) {
               case '*':
                  ans = val1 * val2;
                  break;
               case '/':
                  ans = val1 / val2;
               case '+':
                  ans = val1 + val2;
                  break;
               case '-':
                  ans = val1 - val2;
                  break;
            }
            s.push(ans + "");
         }
      }
      return Double.parseDouble(s.pop());
   }
}
