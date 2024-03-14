import java.util.Scanner;

public class MidnightMadness {
public static void main(String[]args)
{
    Scanner scan = new Scanner (System.in);

    System.out.println("Enter your age: ");
    int age = scan.nextInt();

    System.out.println("Enter time in 24 hours clocl (ticket sold after 10 pm): ");
    int time = scan.nextInt();

    double ticketprice;

        if (age > 13) {
            if (time < 2200)
                ticketprice = 4.00;
        }   
        else
        {
            ticketprice = 8.00;
        }

    }
}
    

