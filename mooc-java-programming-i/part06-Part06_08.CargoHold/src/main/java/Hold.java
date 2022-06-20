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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private Item Item;
    

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;
        while (!(suitcases.isEmpty())) {
            for(Suitcase suitcase : suitcases ) {
                totalWeight += suitcase.totalWeight();
            }
        break;
        }
        return totalWeight;
    } 

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight()+" kg)";
    }
    
    public void printItems() {
        while (!(suitcases.isEmpty())) {
            for (Suitcase suitcase : suitcases) {
                suitcase.printItems();
            }
            break;
        }
    }
    
}
