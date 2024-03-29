import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the weight of the trash load in pounds: ");
        double weight = scanner.nextDouble();

        
        double charge;
        if (weight <= 200) {
            charge = 20.0;
        } else {
            int additionalHundredPounds = (int) ((weight - 200) / 100);
            charge = 20.0 + (additionalHundredPounds + 1) * 8.0; 
        }

        System.out.println("The charge for disposing of " + weight + " pounds of trash is $" + charge);

    
    }
}
