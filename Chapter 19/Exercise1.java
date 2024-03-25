import java.util.Scanner;

public class Exercise1 {
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        int start, end;
        
        System.out.printf("Enter start: ");
        start = scan.nextInt();

        System.out.printf("Enter end: ");
        end = scan.nextInt();   
        
        while (start <= end) {
            
            System.out.println(start);
                
            start = start + 1;
        }
    }
}