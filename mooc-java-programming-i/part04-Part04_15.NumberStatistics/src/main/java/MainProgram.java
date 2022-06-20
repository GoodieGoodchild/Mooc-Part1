
import java.util.Scanner;


public class MainProgram {
    


    public static void main(String[] args) {
        
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        int evenTotal = 0;
        int oddTotal = 0;
        
        System.out.println("Enter numbers: ");
        int input = Integer.valueOf(scanner.nextLine());
        
        while (true) {
            
            if (input == -1) {
                break;
            }

            statistics.addNumber(input);

            if (input % 2 == 0) {
                even.addNumber(input);
            } else {
                odd.addNumber(input);
            }
            
            
            input = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
