import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an angle in degrees: ");
        double angleDegrees = scanner.nextDouble();

        double angleRadians = Math.toRadians(angleDegrees);
        double sinValue = Math.sin(angleRadians);
        double cosValue = Math.cos(angleRadians);

        double sinSquared = sinValue * sinValue;
        double cosSquared = cosValue * cosValue;
        double sum = sinSquared + cosSquared;

        System.out.printf("sin(%.2f) is: %.2f%n", angleDegrees, sinValue);
        System.out.printf("cos(%.2f) is: %.2f%n", angleDegrees, cosValue);
        System.out.printf("sin(%.2f)^2 is: %.2f%n", angleDegrees, sinSquared);
        System.out.printf("cos(%.2f)^2 is: %.2f%n", angleDegrees, cosSquared);
        System.out.printf("sum is: %.2f%n", sum);
    }
}
