
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Last Number?");
        int lastNum = Integer.valueOf(scanner.nextLine());


     
        int sumTot = 0;
        for (int i = firstNum; i <= lastNum; i++) {

            
            sumTot = sumTot + i;
            //System.out.println(i);
            //System.out.println(sumTot);
        }

        System.out.println("The sum is " + sumTot);

        
    }
}
