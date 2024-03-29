import java.util.Random;

public class RandomNames {
    public static void main(String[] args) {
        Random random = new Random();

        
        int firstNameIndex = random.nextInt(7); 
        int lastNameIndex = random.nextInt(7); 

    
        String firstName = "";
        String lastName = "";

        switch (firstNameIndex) {
            case 0: firstName = "Ethan"; break;
            case 1: firstName = "Sophia"; break;
            case 2: firstName = "Noah"; break;
            case 3: firstName = "Ava"; break;
            case 4: firstName = "Liam"; break;
            case 5: firstName = "Isabella"; break;
            case 6: firstName = "Mason"; break;
        }

        switch (lastNameIndex) {
            case 0: lastName = "Gonzalez"; break;
            case 1: lastName = "Lopez"; break;
            case 2: lastName = "Perez"; break;
            case 3: lastName = "Rodriguez"; break;
            case 4: lastName = "Hernandez"; break;
            case 5: lastName = "Garcia"; break;
            case 6: lastName = "Martinez"; break;
        }

        System.out.println("Randomly Generated Character Name");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        }    
    }       
