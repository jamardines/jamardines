import java.util.Scanner;

public class HarmonicMean {

    public static void main(String[]args)

    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X: ");
        float X = scan.nextFloat();

        System.out.println("Enter Y: ");
        float Y = scan.nextFloat();

        float A = (X + Y) / 2;
        float H = 2 / (1/X + 1/Y);

        System.out.println("Arithmetic mean: " + A);
        System.out.println("Harmonic mean: " + H);



    }
}
