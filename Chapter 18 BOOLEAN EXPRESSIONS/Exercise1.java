import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the balance in the checking account: ");
        double checkingBalance = scanner.nextDouble();

        
        System.out.print("Enter the balance in the savings account: ");
        double savingsBalance = scanner.nextDouble();


        double serviceCharge;
        if (checkingBalance > 1000 || savingsBalance > 1500) {
            serviceCharge = 0.0; 
        } else {
            serviceCharge = 0.15; 
        }

        
        System.out.println("The service charge for writing checks is $" + serviceCharge + " per check.");

    
    }
}
