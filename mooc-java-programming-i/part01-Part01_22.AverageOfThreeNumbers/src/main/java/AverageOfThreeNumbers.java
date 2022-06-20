
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int numA = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int numB = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        int numC = Integer.valueOf(scanner.nextLine());
        double numD = ((numA * 1.0) + (numB  * 1.0) + (numC  * 1.0)) / 3;
        System.out.println("The average is " + numD);
        
    }
}
