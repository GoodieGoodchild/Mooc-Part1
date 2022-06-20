

public class FromOneToParameter {

    public static void printUntilNumber(int number) {
        int count = 0;
        for (int i =0; i < number; i++) {
            count += 1;
            System.out.println(count);
        }
    }
    
    public static void main(String[] args) {
        printUntilNumber(5);

    }

}
