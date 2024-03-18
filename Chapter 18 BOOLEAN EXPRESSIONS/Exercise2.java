import java.util.Scanner;

public class Exercise2 {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int rightf, leftf, rightr, leftr;

        System.out.println("Input right front pressure: ");
        rightf = scan.nextInt();

        System.out.println("Input left front pressure: ");
        leftf = scan.nextInt();

        System.out.println("Input right rear pressure: ");
        rightr = scan.nextInt();

        System.out.println("Input left rear pressure: ");
        leftr = scan.nextInt();

        boolean frontinflationisOk = (rightf == leftf);
        boolean rearinflationisOk = (rightr == leftr);

        if (frontinflationisOk == rearinflationisOk) {
            System.out.println("Inflation is OK!");
        }
        else
        {
            System.out.println("Inflation is not OK!");
        }
    }   

}
