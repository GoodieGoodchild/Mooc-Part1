
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = Integer.valueOf(scanner.nextLine());
        int numB = Integer.valueOf(scanner.nextLine());
        if (numA > numB) {
            System.out.println(numA + " is greater than " + numB);
        } else if (numA == numB) {
            System.out.println(numA + " is equal to " + numB);
        } else {
            System.out.println(numA + "is smaller than " + numB);
        }
    }
}
