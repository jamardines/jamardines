import java.util.Scanner;

public class AddingIntegers {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in); 
    

        System.out.println("How many integers will be added: ");
        int addint = scan.nextInt();


        int count = 0; 
        int sum = 0;
                
        while(count < addint) {
        
        System.out.println("Enter an Integer: ");
            int intputuser = scan.nextInt();
            sum += intputuser;
            count++;
            
        }
        
        System.out.println("The sum is " + sum);

    }
}
