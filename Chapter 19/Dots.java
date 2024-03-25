import java.util.Scanner;

public class Dots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first, second;

        System.out.println("Enter first word: ");
        first = scan.next();

        System.out.println("Enter second word: ");
        second = scan.next();

        int length = 30;
        int count = 0;

        System.out.print(first);
        while (count < length) {
            System.out.print(".");
            count += 1;
        }

        System.out.print(second);
    }
}
