
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class UserInterface {
    
    private Scanner scanner;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner, ArrayList<Bird> birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start() {
        
        while (true) {
            // List Menu option?
            System.out.println("?");
            String com = scanner.nextLine();

            if (com.equals("Quit")) {
                break;
            }
            runComs(com);
        }
    }
    
    public void runComs(String com) {
        
        if (com.equals("Add")) {
            System.out.println("Name:");
            String bName = scanner.nextLine();
            System.out.println("Name in Latin:");
            String lName = scanner.nextLine();
            Bird bird = new Bird(bName,lName);
            birds.add(bird);
        } else if (com.equals("Observation")) {
            System.out.println("Bird?");
            String obName = scanner.nextLine();
            boolean found = false;
            for (int i = 0; i < birds.size(); i++) {
                if (birds.get(i).getName().contains(obName)) {
                    birds.get(i).addObservation();
                    found = true;
                    return;
                }
            }
            if (!found) {
                System.out.println("Not a bird!");
            }
        } else if (com.equals("All")) {
            for (Bird bird : birds) {
                System.out.println(bird.toString());
            }
        } else if (com.equals("One")) {
            System.out.println("Bird?");
            String bName = scanner.nextLine();
            for (int i = 0; i < birds.size(); i ++) {
                if (birds.get(i).getName().contains(bName)) {
                    System.out.println(birds.get(i).toString());
                    return;
                }
            }
            
        }
        
        
    }
}
