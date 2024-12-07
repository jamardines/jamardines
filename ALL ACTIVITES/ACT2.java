import java.util.Scanner;

class ACT2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] even = new int[10];
        int[] odd = new int[10];
        int countEven = 0, countOdd = 0;


        System.out.println("Enter 10 intger number");
        
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();
            if (num % 2 == 0) {
                even[countEven++] = num;
            } else {
                odd[countOdd++] = num;
            }
        }
        System.out.println("Even\t\tOdd");

        
        int maxCount = Math.max(countEven, countOdd);

    
        for (int i = 0; i < maxCount; i++) {
            if (i < countEven) {
                System.out.print(even[i] + "\t\t\t");
            } else {
                System.out.print("\t");
            }

            if (i < countOdd) {
                System.out.println(odd[i] + "\t\t\t");
            } else {
                System.out.println();
            }
        }
    }
}
