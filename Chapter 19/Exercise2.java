import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;

        System.out.println("Enter N: ");
        N = scan.nextInt();

        int loopsum = 0;
        int i = 1;
        while (i <= N) {
            loopsum += i;
            i++;
        }

        int sum = (N * (N + 1)) / 2;

        System.out.println("Loop sum: " + loopsum);
        System.out.println("Formula sum: " + sum);
    }
}
