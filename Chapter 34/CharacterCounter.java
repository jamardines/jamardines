import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.println("Enter a line of text:");
        String inputLine = scanner.nextLine();

    
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        int spaces = 0;

    
        for (int i = 0; i < inputLine.length(); i++) {
            char ch = inputLine.charAt(i);
    
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                case ' ':
                    spaces++;
                    break;
                case '.':
                case ',':
                case '!':
                case '?':
                case ';':
                case ':':
                    punctuation++;
                    break;
                default:
                    if (Character.isLetter(ch)) {
                        consonants++;
                    }
                
            }
        }


        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of punctuation characters: " + punctuation);
        System.out.println("Number of spaces: " + spaces);

        scanner.close();
    }
}
