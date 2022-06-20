
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Recipe {

    private String name;
    private int cookTime;
    private List<String> ingredients;
    
    public Recipe (String name, int cookTime, List<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    public int getTime() {
        return this.cookTime;
    }
    public List<String> getIngr() {
        return this.ingredients;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setTime(int time) {
        this.cookTime = time;
    }
    public void setIngr(List<String> ingredients) {
        this.ingredients = ingredients;
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookTime;
    }
    
}