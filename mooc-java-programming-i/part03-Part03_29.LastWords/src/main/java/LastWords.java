
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        
        while (!sentence.equals("")) {
            
            String[] parts = sentence.split(" ");
            System.out.println(parts[parts.length - 1]);
            
            sentence = scanner.nextLine();
        }
        

    }
}
