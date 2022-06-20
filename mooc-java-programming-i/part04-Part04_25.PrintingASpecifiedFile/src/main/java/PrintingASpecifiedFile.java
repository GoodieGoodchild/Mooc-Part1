
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

// Write a program that asks the user for a string, and then prints the 
// contents of a file with a name matching the string provided. 
// You may assume that the user provides a file name that the program can find.


public class PrintingASpecifiedFile {
    
    static String datatxt = "data.txt";
    static String songtxt = "song.txt";

    public static void printStuff(String fileName) {
        
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
        
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
            
        } catch (Exception e) {
                System.out.println("Exception: " + e.toString());
        }
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        
        System.out.println("Which file should have its contents printed?");
        
        String fileName = scanner.nextLine();
        
        while (!fileName.isEmpty()) {
           
            if (fileName.isEmpty()) {
                break;
            }
            
            printStuff(fileName);
            
            break;
        }
    }
}
