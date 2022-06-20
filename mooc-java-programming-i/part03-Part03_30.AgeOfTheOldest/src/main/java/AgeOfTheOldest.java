
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String sentence = scanner.nextLine();
        int highest = 0;
            
        while (!sentence.equals("")) {
            String[] pieces = sentence.split(",");
            
            
            
            if (Integer.valueOf(pieces[1]) > highest) {
                highest = Integer.valueOf(pieces[1]);
            }
            
            sentence = scanner.nextLine();
           
        }
        
        System.out.println("Age of the oldest: " + highest);
    }
}
