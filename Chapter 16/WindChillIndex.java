import java.util.Scanner;
import java.lang.Math;

public class WindChillIndex {
    public static void main(String[]args)
    {
        
        Scanner scan = new Scanner(System.in);

        double windchill;

        System.out.println("Enter Wind Speed: ");
        double V = scan.nextDouble();

        System.out.println("Enter Temperature: ");
        double temp = scan.nextDouble();

            if (V < 3) {
            windchill = temp;
                } else if (temp > 50) {
                    windchill = temp;
                } else {
                     windchill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(V, 0.16) + 0.4275 * temp * Math.pow(V, 0.16);

                System.out.printf("Wind Chill: %.15f", windchill);
        }
    }

}

