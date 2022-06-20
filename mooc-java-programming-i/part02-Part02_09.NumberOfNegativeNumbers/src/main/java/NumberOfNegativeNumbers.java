
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    static Scanner scanner;
    
        

    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        int negNumbers = 0;
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        while (num != 0) {
            if (num < 0) {
                negNumbers++;
            }
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            
        }
        System.out.println("Number of negative numbers: " + negNumbers);
    }

}
