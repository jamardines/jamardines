package finalscompilation.infixtopostfix;

import finalscompilation.lists.StackList;

public class InfixToPostfix {
   
   private int getPrec(char o) {
      if (o == '*'||o == '/')
         return 2;
      if (o == '+'||o == '-')
         return 1;
      return -1;
   }
   
   public String convert(String infix) {
      StackList s = new StackList();
      String result = "";
      
      for (int i= 0; i < infix.length(); i++) {
         char c = infix.charAt(i);
         
         if (Character.isDigit(c)) {
            result+=c;
         } else if (c == '(') {
            s.push(c+"");
         } else if (c == ')') {
            while (!s.peek().equals("(")) {
               result += s.pop();
            }
            s.pop();
         } else {
            while (!s.isEmpty() && ((getPrec(c) <= getPrec(s.peek().charAt(0))))) {
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
