
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int numbersInputted = 0;
        int sum = 0;
        double average = 0.0;
        int isEven = 0;
        int isOdd = 0;
        System.out.println("Give numbers:");
        while (true) {
            
            int numberFromUser = Integer.valueOf(scanner.nextLine());
           
            if (numberFromUser != -1) {
                numbersInputted = numbersInputted + 1;
                sum = sum + numberFromUser;
                average = (sum * 1.0) / (numbersInputted * 1.0);
                
                if (numberFromUser % 2 ==0) {
                    isEven += 1;
                } else {
                    isOdd += 1;
                }
               
            } else {
                break;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbersInputted);
        System.out.println("Average: " + average);
        System.out.println("Even: " + isEven);
        System.out.println("Odd: " + isOdd);
    }
}
