
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you?");
        int num = Integer.valueOf(scan.nextLine());
        if (num >= 0 && num < 121) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
