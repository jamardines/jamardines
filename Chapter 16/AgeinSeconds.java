import java.util.Scanner;

public class AgeinSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        int years = scanner.nextInt();
        System.out.print("Enter your age in months: ");
        int months = scanner.nextInt();
        System.out.print("Enter your age in days: ");
        int days = scanner.nextInt();

        int totalDaysLived = years * 365 + months * 31 + days;

        if (months > 7) {
            totalDaysLived = totalDaysLived - 4; 
        } else if (months % 2 == 0 && months <= 6) {
            totalDaysLived = totalDaysLived - 1; 
        }


        long ageInSeconds = totalDaysLived * 24 * 60 * 60;

        double expectedLifespanInSeconds = 2.5 * 1000000000; 
        double percentageLived = (ageInSeconds / expectedLifespanInSeconds) * 100;

        System.out.println("Your age in seconds: " + ageInSeconds);
        System.out.println("You have lived " + percentageLived + "% of your expected lifespan.");

        scanner.close();
    }
}
