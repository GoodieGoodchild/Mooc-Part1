
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputs = scanner.nextLine();
        
        int oldest = 0;
        String oldestName = "";
        
        while (!inputs.equals("")) {
            String[] pieces = inputs.split(",");
            
            if (Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
                oldestName = pieces[0];
            }
            
            inputs = scanner.nextLine();
        }
        
        System.out.println("Name of the oldest: " + oldestName);
        
    }
}
