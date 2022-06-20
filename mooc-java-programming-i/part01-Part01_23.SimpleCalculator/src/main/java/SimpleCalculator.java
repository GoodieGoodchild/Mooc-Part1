
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int numA = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int numB = Integer.valueOf(scanner.nextLine());
        int numC = numA + numB;
        int numD = numA - numB;
        int numE = numA * numB;
        double numF = (numA * 1.0) / (numB * 1.0);
        System.out.println(numA + " + " + numB + " = " + numC);
        System.out.println(numA + " - " + numB + " = " + numD);
        System.out.println(numA + " * " + numB + " = " + numE);
        System.out.println(numA + " / " + numB + " = " + numF);
        
    }
}
