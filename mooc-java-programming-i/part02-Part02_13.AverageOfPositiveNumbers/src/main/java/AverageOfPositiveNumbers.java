
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    
    /*
    Write a program that asks the user for input until the user inputs 0. 
    After this, the program prints the average of the positive numbers (numbers that are greater than zero).

    If no positive number is inputted, the program prints "Cannot calculate the average"

    Below a few examples of the programs output

    Sample output
    3
    5
    1
    -3
    0
    3.0
    ------------------------
    0
    Cannot calculate the average
    -------------------------
    */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posTot = 0;
        int cnt = 0;
        double ave = 0; 
        int num = 0;
        while (true) {
            num = Integer.valueOf(scanner.nextLine());
            
            
            if (num!=0 && num > 0) {
                posTot = posTot + num;
                cnt = cnt + 1;
            } else if (num == 0) {
                break;
            }
            
            
        }
        if (cnt == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            ave = posTot * 1.0 / cnt * 1.0;
            System.out.println(ave);
        }
        
    }
}
