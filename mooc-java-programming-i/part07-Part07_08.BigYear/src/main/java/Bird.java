/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Bird {

    private String name;
    private String lName;
    private int observations;

    public Bird(String name, String lName) {
        this.name = name;
        this.lName = lName;
        this.observations = 0;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlName() {
        return lName;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public String getName() {
        return name;
    }
    
    public void addObservation() {
        this.observations++;
    }
    public int getObservations() {
        return this.observations;
    }
    
    public String toString() {
        return this.name + " (" + this.lName + "): " + this.observations + " observations";
    }
    
}
