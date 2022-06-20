
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = "Caput Draconis";
        
        // Write your program here 
        System.out.println("Passwoprd?");
        String password = scan.nextLine();
        if (password.equals(pass)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
       
    }
}
