

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
             double value2 = Double.parseDouble(s.pop());
             double value1 = Double.parseDouble(s.pop());
             
             switch (c) {
                case '*':
                   ans = value1 * value2;
                   break;
                case '/':
                   ans = value1 / value2;
                case '+':
                   ans = value1 + value2;
                   break;
                case '-':
                   ans = value1 - value2;
                   break;
             }
             s.push(ans + "");
          }
       }
       return Double.parseDouble(s.pop());
    }
 }