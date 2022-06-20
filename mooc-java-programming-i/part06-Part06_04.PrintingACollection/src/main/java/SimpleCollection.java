
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }
    
    public String getName() {
        return this.name;
    }
    
    public ArrayList<String> getElements() {
        return this.elements;
    }
    
public String toString() {
        String printOutput = "The collection " + this.name;
        if (elements.isEmpty()) {
            return printOutput + " is empty.";
        }
        String theList = ""; 
        int s = this.elements.size();

        int i = 0;
        for (String element : elements) {
            if (i < s - 1) {
                theList += element+"\n";
            } else {
                theList+= element;
            }
            i++;
        }
        
        if (s == 1) {
            return printOutput + " has " + s + " element:" + "\n"
                    + theList;
        } else {
            return printOutput + " has " + s + " elements:" + "\n"
                    + theList;
        }
    }
    
}
