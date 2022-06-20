/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Exercise {
    
    private String name;
    private boolean completed;
    
    public Exercise(String name, boolean completed) {
        
        this.name = name;
        this.completed = completed;
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public boolean isCompleted() {
        return completed;
    }
    
    
}
