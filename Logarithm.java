import java.util.Scanner;

public class Logarithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double:");
        double x = scanner.nextDouble();
        
        double result = Math.log(x) / Math.log(2);
        
        System.out.println("Base 2 log of " + x + " is " + result);
    }
}
