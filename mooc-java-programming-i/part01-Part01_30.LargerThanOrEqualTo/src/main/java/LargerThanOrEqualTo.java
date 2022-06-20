
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int nA = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int nB = Integer.valueOf(scan.nextLine());
        if (nA > nB) {
            System.out.println("Greater number is: " + nA);
        } else  if (nB > nA){
            System.out.println("Greater number is: " + nB);
        } else if (nA == nB) {
            System.out.println("The numbers are equal!");
        }

    }
}
