
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(statistics, scanner);
        ui.start();

    }
}
