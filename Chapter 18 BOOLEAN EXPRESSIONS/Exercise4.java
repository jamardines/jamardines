import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean goodPressure = true;

        System.out.println("Input right front pressure"); // RIGHT FRONT
        int rightFrontPressure = scan.nextInt();

        if (rightFrontPressure >= 35 || rightFrontPressure <= 45) {
            goodPressure = false;
        }

        System.out.println("Input left front pressure"); //LEFT FRONT
        int leftFrontPressure = scan.nextInt();

        if (leftFrontPressure >= 35 || leftFrontPressure <= 45) {
            goodPressure = false;
        }

        System.out.println("Input right rear pressure"); // RIGHT REAR
        int rightRearPressure = scan.nextInt();

        if (rightRearPressure >= 35 || rightRearPressure <= 45) {
            goodPressure = false;
        }

        System.out.println("Input left rear pressure"); // LEFT REAR
        int leftRearPressure = scan.nextInt();

        if (leftRearPressure >= 35 || leftRearPressure <= 45) {
            goodPressure = false;
        }

        if (goodPressure) {
            System.out.println("Inflation is OK!");
        } 
        else
        {
            System.out.println("Inflation is not OK!");
        }

    }
}
