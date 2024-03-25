import java.util.Scanner;

public class NNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int N = scanner.nextInt();
        
        double sumOfNumbers = 0;
        double sumOfSquares = 0;

        // Read in the floating point numbers and calculate sum and sum of squares
        for (int i = 0; i < N; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            sumOfNumbers += num;
            sumOfSquares += num * num;
        }

        // Compute the average
        double avg = sumOfNumbers / N;

        // Compute the average of squares
        double avgSquare = sumOfSquares / N;

        // Compute the standard deviation
        double stdDeviation = Math.sqrt(avgSquare - (avg * avg));

        System.out.println("Average: " + avg);
        System.out.println("Standard Deviation: " + stdDeviation);
        
        scanner.close();
    }
}
