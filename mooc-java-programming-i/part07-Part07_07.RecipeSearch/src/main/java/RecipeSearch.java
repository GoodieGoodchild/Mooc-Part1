import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(scanner);
        
        ui.start();
        
    }
}