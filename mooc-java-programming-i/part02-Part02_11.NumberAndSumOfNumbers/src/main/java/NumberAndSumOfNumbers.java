import java.util.Scanner;
 
public class NumberAndSumOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersInputted = 0;
        int sum = 0;
       
        while (true) {
            System.out.println("Give a number: ");
            int numberFromUser = Integer.valueOf(scanner.nextLine());
           
            if (numberFromUser != 0) {
                numbersInputted = numbersInputted + 1;
                sum = sum + numberFromUser;
               
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + numbersInputted);
        System.out.println("Sum of the numbers: " + sum);
    }
}