
import java.util.ArrayList;

public class RemoveLast {
    
    public static void removeLast(ArrayList<String> strings) {
        
        int lastIndex = strings.size() - 1;
        
        if(strings.size()==0) {
            return;
        } 
        
        strings.remove(lastIndex);
    }

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        
        removeLast(strings);
        System.out.println(strings);
    }

}
