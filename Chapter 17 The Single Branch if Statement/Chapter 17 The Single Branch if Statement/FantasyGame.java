import java.util.Scanner;

public class Exercise4 {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        String name;
        int strength, health, luck;

        System.out.print("Welcome to Yertle's Quest\n");

        System.out.println("Enter the name of your character: ");
        name = scan.next();

        System.out.println("Enter Strength (1-10): ");
        strength = scan.nextInt();

        System.out.println("Enter health (1-10): ");
        health = scan.nextInt();

        System.out.println("Enter luck (1=10): ");
        luck = scan.nextInt();

        int total = strength + health + luck;

        

        if (total <= 15) {
            System.out.println("Strong Character!");
        }
        else if (total > 15) {
            System.out.println("You have give your character  too many points! Default values have been assigned: ");

            strength = 5;
            health = 5;
            luck = 5;
        }

        System.out.println(name + ", Strength: " + strength + ", Health: " + health + ", luck: " + luck);
    
        
    }
}
