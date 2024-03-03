import java.util.Scanner;

public class Exercise1
{
  public static void main ( String[] args )
  {
    

    Scanner scan = new Scanner(System.in);
    System.out.printf("Enter x: ");
    double x = scan.nextDouble();

   double eAproximation = Math.pow ((1 + (1 / x)), x);

    System.out.printf("Aproximation to e: %.7f%n ", eAproximation);



  }
}