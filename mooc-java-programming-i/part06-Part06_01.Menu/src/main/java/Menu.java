
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        
        if (!(meals.contains(meal))) {
            meals.add(meal);
        }
        
        
    }
    
    public void printMeals() {
        while (!(meals.isEmpty())) {
            for (int i = 0; i < meals.size(); i++) {
                System.out.println(meals.get(i));
            }
            break;
        }
    }
    
    public void clearMenu() {
        meals.removeAll(meals);
    }
   
}
