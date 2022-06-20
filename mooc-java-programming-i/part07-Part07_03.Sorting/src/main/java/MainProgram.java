
import java.util.Arrays;
import java.util.Collections;


public class MainProgram {

    public static int smallest(int[] array) {
        int smallestInt = 100;
        for (int i =0; i < array.length; i++) {
            if (array[i] < smallestInt){
                smallestInt = array[i];
            }
            
        }
        return smallestInt;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int min = array[index];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    int minIndex = startIndex;
    for (int i = startIndex; i < table.length; i++) {
        if (table[i] < table[minIndex]) {
            minIndex = i;
        }
    }
    return minIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        
        for (int i = 0; i < array.length; i++) {
            int temp = indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, temp);
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        // write your test code here
        int[] array = {52, 9, 34, 12, 72, 72};
        int[] numbers = {3, 2, 5, 4, 8};
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        
        
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
        
    }

}
