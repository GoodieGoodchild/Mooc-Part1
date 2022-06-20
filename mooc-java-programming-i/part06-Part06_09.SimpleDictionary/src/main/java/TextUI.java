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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI (Scanner scanner, SimpleDictionary simpleDitionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDitionary;
    }
    
    
    public void start() {
        //do something here
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String trans = scanner.nextLine();
                simpleDictionary.add(word, trans);
            } else if (command.equals("search")){
                System.out.println("To be translated:");
                String wordToTranslate = scanner.nextLine();
                if (simpleDictionary.getTranslation(wordToTranslate) == null) {
                    System.out.print("Word " + wordToTranslate + " was not found");
                } else {
                    System.out.print("Translation: " + simpleDictionary.getTranslation(wordToTranslate));    
                }
            }   
            System.out.println("Unknown Command");
        }  
    }
}

