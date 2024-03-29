import java.util.Scanner;

public class PieEatingContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter contestant's weight: ");
        double weight = scanner.nextDouble();

        if (weight >= 220 && weight <= 280) {
            System.out.println("Contestant is allowed in the contest.");
        } else {
            System.out.println("Contestant is not allowed in the contest.");
        }

    }
}
