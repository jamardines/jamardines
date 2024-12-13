package finalscompilation.others;

import finalscompilation.main.Compilation;;

public class EvenAndOdd {
    public void evenodd(java.util.Scanner scan) {
        int[] evenNums = new int[10];
        int[] oddNums = new int[10];
        int evenCount = 0, oddCount = 0;
        
        System.out.println("Enter 10 integers");
        
        for (int i = 0; i < 10; i++) {
            int num = Compilation.inputInt("", scan);
            if (num % 2 == 0) {
                evenNums[evenCount++] = num;
            } else {
                oddNums[oddCount++] = num;
            }
        }

        System.out.println("Even\t\t\tOdd");
        for (int i= 0; i < (Math.max(evenCount, oddCount)); i++) {
            if (i < evenCount) {
                System.out.print(evenNums[i] + "\t\t\t\t");
            } else {
                System.out.print("\t\t\t\t");
            }
            
            if (i < oddCount) {
                System.out.println(oddNums[i] + " ");
            } else {
                System.out.println("");
            }
        }
    }
}