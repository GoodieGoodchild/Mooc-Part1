
import java.util.Scanner;

public class Login {
    
    
    

    public static void main(String[] args) {
        System.out.print("Enter username: ");
        Scanner scanner = new Scanner(System.in);
        
        
        String username = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        if ((username.equals("alex") && password.equals("sunshine")) || (username.equals("emma") && password.equals("haskell"))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password");
        }
        
        

    }
}