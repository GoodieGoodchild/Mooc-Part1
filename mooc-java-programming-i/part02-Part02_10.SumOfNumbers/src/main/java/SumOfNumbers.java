
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int total = 0;
        while (num != 0) {
            total = total + num;
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Sum of the numbers: " + total);
    }
}