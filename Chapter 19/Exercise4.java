import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inputString;

        System.out.println("Enter a word: ");
        inputString = scan.next();

        int times = inputString.length();
        int i = 0;

        while (i < times) {
            System.out.println(inputString);
            i++;
        }
    }
}
