import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name: ");
        String name = scanner.nextLine();
        
        while (true) {
            
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            //Create the television program object, populate it and add it to the programs array list.
                //add the name and the integer
            TelevisionProgram tp = new TelevisionProgram(name, duration);
            programs.add(tp);
        
            System.out.println("Name: ");
            name = scanner.nextLine();

        }
        
        System.out.println("Program's maximum duration?" );
        
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for(int i = 0; i < programs.size(); i++) {
            if (maxDuration >= programs.get(i).getDuration()) {
                System.out.println(programs.get(i).toString());
            }
        }
    }
}
