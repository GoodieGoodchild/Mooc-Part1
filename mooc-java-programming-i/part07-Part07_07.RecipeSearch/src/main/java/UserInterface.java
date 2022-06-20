
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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

    private ArrayList<String> recRaw;
    private ArrayList<Recipe> recipes;
    private ArrayList<Integer> indices;
    private List<String> ingredients;
    private Scanner scanner;
    private Recipe recipe;
            
    public UserInterface(Scanner scanner) {
        
        this.scanner = scanner;
        this.recRaw = new ArrayList<>();
        this.recipes = new ArrayList<>();
        this.indices = new ArrayList<>();

    }
    
    public void start() {
        
        loadMenu();
    }
    
    public void loadMenu() {
        
        System.out.println("File to read: ");
        
        // accept command from user and execute command
        Scanner comInput = new Scanner(System.in);
        String fileName = comInput.nextLine();
            
        generateRecipes(fileName);
        
        while (true) {
            System.out.print("Enter command: ");
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");
            
            
            String command = comInput.nextLine();
            
            // command "stop" implementation 
            if (command.equals("stop")) {
                break;
            }
            
            
            
            // command "list" implementation
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipes) {
                    System.out.println(r);
                }
                System.out.println("");
            }
            
            // command "find name" implementation
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String search = comInput.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipes) {
                    if (r.getName().contains(search)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }

            // command "find cooking time" implementation
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(comInput.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipes) {
                    if (r.getTime() <= maxTime) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
            
            // command "find ingredient" implementation
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = comInput.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipes) {
                    if (r.getIngr().contains(ingredient)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            } 
        }
    }
    
    public void generateRecipes(String fileName) {

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                recRaw.add(row);
            }
        }
        catch (Exception e) {
            System.out.println("An error occured..");
            loadMenu();
        }
        
        for (String r: recRaw) {
            if (isInteger(r)) {
                indices.add(recRaw.indexOf(r));
            }
        }
        
        //split and regroup the recipes - to do the first two 
        for (int i = 0; i < indices.size(); i++) {
            int j = indices.size() -1;
            String name = recRaw.get(indices.get(i) - 1);
            int time = Integer.valueOf(recRaw.get(indices.get(i)));
            if (i < indices.size() - 1) {
            List<String> ings = recRaw.subList(indices.get(i) + 1, indices.get(i + 1) - 1);
            recipes.add(new Recipe(name, time, ings));
            } else {
                time = Integer.valueOf(recRaw.get(indices.get(j)));
                name = recRaw.get(indices.get(j) - 1);
                List<String> ings = recRaw.subList(indices.get(j) + 1, recRaw.size());
                recipes.add(new Recipe(name, time, ings));
            
            }
        }
    }
    
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
}
