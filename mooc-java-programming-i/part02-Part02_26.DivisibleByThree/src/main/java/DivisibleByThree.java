
import java.util.Scanner;

public class DivisibleByThree {
    
    public static void divisibleByThreeInRange(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i%3==0) {
                count += 1;
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2,10);

    }

}
