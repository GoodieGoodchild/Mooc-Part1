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
public class Suitcase {
    
    private ArrayList<Item> items;
    private int weight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.weight = maxWeight;
    }
    
    public void addItem(Item item) {
        
        if (totalWeight() + item.getWeight() <= this.weight){
        items.add(item);
        
        }
    }
    
    public String toString (){
        if (items.size() == 0){
            return "no items (" + totalWeight() + " kg)" ;
        }
        if (items.size() == 1){
            return items.size() + " item ("  + totalWeight() + " kg)" ;
        }
        return items.size() + " items ("  +  totalWeight() + " kg)" ;
    }
    
    public void printItems() {
        while (!(items.isEmpty())) {
            for (Item item : items) {
                System.out.println(item.toString());
            }
            break;
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        while (!(items.isEmpty())) {
            for(Item item : items ) {
                totalWeight += item.getWeight();
            }
        break;
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        Item heaviestItem = new Item("Feather", 1);
        while (!(items.isEmpty())) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getWeight() > heaviestItem.getWeight()) {
                    heaviestItem = items.get(i);
                }
            }
            return heaviestItem;
        }
        return null;
    }
    
}
