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
public class Stack {

    private ArrayList<String> stackList;
    
    public Stack() {
        this.stackList = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        
        if (stackList.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        
        if (!(stackList.contains(value))) {
            stackList.add(value);
        }
        
    }
    
    public ArrayList<String> values() {
        if (!(stackList.isEmpty())) {
            for (int i = 0; i < stackList.size(); i++) {
                System.out.println(stackList.get(i));
            }
        }
        
        return stackList;
    }
    
    public String take() {
        
        int index = stackList.size() - 1;
        String lastValue = stackList.get(index);
        stackList.remove(index);
        return lastValue;
    }
    
}
