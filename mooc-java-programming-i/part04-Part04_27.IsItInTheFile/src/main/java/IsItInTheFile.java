
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        Boolean noFile = false;
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while (fileScanner.hasNextLine()) {
                nameList.add(fileScanner.nextLine());
            }
            
        } catch (Exception e) {
            noFile = true;
        }
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if (noFile) {
            System.out.println("Reading the file " + file + " failed.");
        }else if (nameList.contains(searchedFor)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found.");
        }
    }
}
