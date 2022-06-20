
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


class Person {
    
    String name;
    String age;
    
    public Person (String name, String age) {
        this.name = name;
        this.age = age;
    }
    
}

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Person> children = new ArrayList<>();
        
        System.out.println("Name of the file?");
        
        String fileName = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            
            while (fileScanner.hasNextLine()) {
                String[] line = fileScanner.nextLine().split(",");
                String name = line[0];
                String age = line[1];
                
                children.add(new Person(name, age));
            }
            
        } catch (Exception e) {
            
        }
        for (int i = 0; i < children.size(); i++) {
            Person child = children.get(i);
            System.out.println(child.name + ", age: " + child.age + " years");
        }
    }
}
