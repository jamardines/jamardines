import java.util.Scanner;

public class Groundbeef{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Price per pound package A: ");
        double poundA = scan.nextDouble();
        System.out.println("The percent lean in package A: ");
        double leanA = scan.nextDouble();

        System.out.println("Price per pound package B: ");
        double poundB = scan.nextDouble();
        System.out.println("The percent lean in package B: ");
        double leanB = scan.nextDouble();

        double PerPoundLeanA = poundA / ( leanA / 100);
        double PerPoundLeanB = poundB / ( leanB / 100);
            
        if (PerPoundLeanA < PerPoundLeanB) {
            System.out.println("Package A is the best value");
        } else if (PerPoundLeanA > PerPoundLeanB) {
            System.out.println("Package B is the best value");
        } else {
            System.out.println("Both packages have the same value");
        }

        System.out.printf("Package A cost per pound of lean: %.1f\n", PerPoundLeanA);
        System.out.printf("Package A cost per pound of lean: %.6f\n", PerPoundLeanB);



    }
}