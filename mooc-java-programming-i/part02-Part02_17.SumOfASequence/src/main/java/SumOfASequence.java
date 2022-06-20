
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Last number?");
            int lastNum = Integer.valueOf(scanner.nextLine());

            int sum = 0;
            int sumTot = 0;
            for (int i = 0; i < lastNum; i++) {

                sum += 1;
                sumTot = sumTot + sum;
                System.out.println(sum);
            }

            System.out.println("The sum is " + sumTot);
            break;
        }
    }
}
