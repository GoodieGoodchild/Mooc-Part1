/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;
    
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while (true) {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
        
        String readLine = scanner.nextLine();
        
        if (readLine.equals("X")) {
            break;
        }
        if (readLine.equals("1")) {
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            manager.addJoke(joke);
        }
        if (readLine.equals("2")) {
            manager.drawJoke();
        }
        if (readLine.equals("3")) {
            manager.printJokes();
        }
        
       } 
    }
}
