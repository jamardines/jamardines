import java.util.Scanner;

public class Exercise2 {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Air Temperature: ");
        float tair = scan.nextFloat();

        System.out.println("Enter the Steam Temperature: ");
        float tsteam = scan.nextFloat();

        float efficiency;

        if (tsteam < 373.0f) {
            efficiency = 0.0f;
        }
        else
        {
            efficiency = 1 - (tair / tsteam);
        }
        System.out.println("Maximum possible efficiency of the steam engine: " + efficiency);
    }
}