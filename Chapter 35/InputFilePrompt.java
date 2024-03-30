import java.util.Scanner;

public class InputFilePrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("input file: ");
            String fileName = scanner.nextLine().trim(); 
            
            if (fileName.isEmpty()) {
                System.out.println(">>>file name missing<<<");
                continue;
            }

        
            if (fileName.contains(" ")) {
                System.out.println(">>>file name must not contain spaces<<<");
                continue;
            }

            
            if (!fileName.endsWith(".dat")) {
                System.out.println(">>>file name must end with .dat<<<");
                continue;
            }

            
            System.out.println("OK");
            break;
        }

    []
    }
}
