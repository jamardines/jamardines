import java.util.Scanner;

public class Y2KProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year of Birth: ");
        int birthYear = scanner.nextInt();

        System.out.print("Current year: ");
        int currentYear = scanner.nextInt();

        int age;

        
        int birthCentury = 0;
        if (birthYear >= 0 && birthYear <= 21) {
            birthCentury = 2000;
        } else {
            birthCentury = 1900;
        }

        int currentCentury = 0;
        if (currentYear >= 0 && currentYear <= 21) {
            currentCentury = 2000;
        } else {
            currentCentury = 1900;
        }

        
        if (currentYear >= birthYear) {
            age = currentCentury + currentYear - (birthCentury + birthYear);
        } else {
            age = currentCentury - 100 + currentYear - (birthCentury + birthYear);
        }

        System.out.println("Your age: " + age);

    }
}
