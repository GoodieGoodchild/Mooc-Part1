
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container containerA = new Container();
        Container containerB = new Container();

        
        while (true) {
            
            System.out.println("First: " + containerA.toString());
            System.out.println("Second: " + containerB.toString());

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (value <= 0) {
            }

            if (command.equals("add")) {
                containerA.add(value);
            }

            if (command.equals("remove")) {
                containerB.remove(value);
            }
            
            if (command.equals("move")) {
        
                if (value <= 0) {
                   //do nothing
                } else if (containerA.contains() - value < 0) {
                    int dif = value - containerA.contains();
                    containerA.remove(value);
                    containerB.add(value - dif);

                } else if (containerA.contains() - value >= 0) {
                    containerA.remove(value);
                    containerB.add(value);
                } 
            }
        }
    }
}
