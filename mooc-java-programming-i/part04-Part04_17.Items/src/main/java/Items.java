
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
                
        String input = scanner.nextLine();
        int i = 0;
        while (true) {
            
            if (input.isEmpty()) {
                break;
            }
            
            Item item = new Item(input);
            
            items.add(i, item);
            
            i++;
            input = scanner.nextLine();
        }
        
        for (int j = 0; j < items.size(); j++) {
            System.out.println(items.get(j));
        }

    }
}
