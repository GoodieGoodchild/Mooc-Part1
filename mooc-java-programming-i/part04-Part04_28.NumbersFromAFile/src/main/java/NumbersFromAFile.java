
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> array = new ArrayList<>();
        
        int total = 0;
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while (fileScanner.hasNextLine()) { // if the file has another line
            
                int testInt = Integer.valueOf(fileScanner.nextLine());
                
                if (lowerBound <= testInt && testInt <= upperBound) {
                    total += 1; // add one to the total number of numbers in range
                }
            
            }
        }catch (Exception e) {
        }
        System.out.println("Numbers: " + total);
        
    }
}
