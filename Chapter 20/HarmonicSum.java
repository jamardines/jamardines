import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int N;
        double sum = 0;

        System.out.println("Enter N: ");
        N = scan.nextInt();
        
        int i = 1;

        while (i <= N) {
            sum += 1.0 / i;
            i++;
        }
        
        System.out.println("Sum is: " + sum);
    }
}
