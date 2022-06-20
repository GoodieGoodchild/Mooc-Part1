
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int total = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                break;
            }
            list.add(num);
            total += num;
            count += 1;
        }
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        double average = (total * 1.0 / count * 1.0);
        System.out.println("Average: " + average);
        
    }
}
