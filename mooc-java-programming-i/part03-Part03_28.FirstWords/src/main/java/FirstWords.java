
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String sentence = scanner.nextLine();
        
        while (!sentence.equals("")) {
        
            String[] pieces = sentence.split(" ");
            System.out.println(pieces[0]);
            sentence = scanner.nextLine();
        }
    }
}
