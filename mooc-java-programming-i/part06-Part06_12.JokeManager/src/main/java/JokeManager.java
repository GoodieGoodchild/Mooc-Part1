/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jonat
 */
public class JokeManager {
    
    private ArrayList<String> jokeList;
    
    public JokeManager() {
        this.jokeList = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        jokeList.add(joke);
    }

    public String drawJoke(){
        while (!(jokeList.isEmpty())) {
            Random draw = new Random();
            int index = draw.nextInt(jokeList.size());
            String joke = jokeList.get(index);
            System.out.println(joke);
            return joke;
        }
        return "Jokes are in short supply.";
    }
    
    public void printJokes(){
        for (int a = 0;a < this.jokeList.size();a++){
            System.out.println(this.jokeList.get(a));
        }
    }
    
 
}
