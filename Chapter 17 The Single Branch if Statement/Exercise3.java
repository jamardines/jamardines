import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        int itemCount, time;

        System.out.println("How many items to heat: ");
        itemCount = scan.nextInt();

        System.out.println("Time for one item: ");
        time = scan.nextInt();

        if (time >= 100) {
            int minutes = time / 100;
            int seconds = time % 100;
            time = minutes * 60 + seconds;
        }

        if (itemCount == 1) {
        }
        else if (itemCount == 2) {
            time = time + time / 2;
        }
        else if (itemCount == 3) {  
            time = time * 2;
        }
        else 
        {
            System.out.println("Heating more than three items at once is not recommended. ");
        }

        int minutes = time / 60;
        int seconds = time % 60;

        System.out.println("Heat for " + minutes + " minutes " + seconds + " seconds");
        
        
    }
    
}
