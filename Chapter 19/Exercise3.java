import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int low, high;

        System.out.println("Enter low: ");
        low = scan.nextInt();

        System.out.println("Enter high: ");
        high = scan.nextInt();

        int sum = 0;
        int i = low;

        while (i <= high) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
