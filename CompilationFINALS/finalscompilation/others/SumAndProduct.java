package finalscompilation.others;

import finalscompilation.main.Compilation;

public class SumAndProduct {
    public void sumprod(java.util.Scanner scan) {
        int input; 
        int sum = 0;
        int prod = 1;
        
        System.out.println("Enter 10 integers: ");
        
        for (int i = 0; i < 10; i++) {
            input = Compilation.inputInt("", scan);
            if (input > 0) {
                sum+=input;
                prod*=input;
            }
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
    }
}