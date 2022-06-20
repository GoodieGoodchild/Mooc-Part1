
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String notEnd = scanner.nextLine();
        int count = 0;
        
        while (true) {
            
            if (notEnd.equals("end")) {
                break;
            }
            
            count++;
            notEnd = scanner.nextLine();
        }

        System.out.println(count);
        
    }
}
