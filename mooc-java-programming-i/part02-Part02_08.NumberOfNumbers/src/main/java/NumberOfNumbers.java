
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        while (num != 0) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            counter++;
        }
        System.out.println("Number of numbers: " + counter);

    }
}
