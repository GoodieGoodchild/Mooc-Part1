/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author jonat
 */
public class Room {
    
    ArrayList<Person> peopleinRoom;

    public Room() {
        this.peopleinRoom = new ArrayList<>();
    }
    
    public void add(Person person) {
        peopleinRoom.add(person);
    }
    
    public boolean isEmpty() {
        if (peopleinRoom.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        
        return peopleinRoom;
    }
    
    public Person shortest() {
        Person shorty = new Person("jane",200);
        while (!(peopleinRoom.isEmpty())) {
            for (int i = 0; i < peopleinRoom.size(); i++) {
                if (peopleinRoom.get(i).getHeight() < shorty.getHeight()) {
                    shorty = peopleinRoom.get(i);
                    int shortestIndex = i;
                }
            }
            return shorty;
        }
        return null;
    }
    
    public Person take() {
        Person shortness = new Person("Giant",500);
        while (!(peopleinRoom.isEmpty())) {
        for (int i = 0; i < peopleinRoom.size(); i++) {
            if (peopleinRoom.get(i).getHeight() < shortness.getHeight()) {
                shortness = peopleinRoom.get(i);
            }
        }
        peopleinRoom.remove(shortness);
        return shortness;
        }
        return null;
    }
    
}
