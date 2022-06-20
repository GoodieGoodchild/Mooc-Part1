
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        
        int total = 0;
        int count = 0;
        double average;
        
        String details = scanner.nextLine();
        
        
        while (!details.equals("")) {
            
            String[] info = details.split(",");
            
            if (info[0].length() > longestName.length()) {
                longestName = info[0];
            }
            total += Integer.valueOf(info[1]);
            count += 1;
            
            
            details = scanner.nextLine();
        }
        average = (total * 1.0) / (count * 1.0);
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);


    }
}
