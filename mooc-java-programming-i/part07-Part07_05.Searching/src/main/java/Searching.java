
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Searching {
    
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size();i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        
        // Binary search didn't find a book in list contaiting five books, 
        // even though the book was on the list. Try testing binary search with a large number of books
        // ### MY NOTES : this search works when i run the program with 100 books and a search ID of 5, but fails the test
        // with 54% - I know I still need to sort this list in this part, just struggling with the arraylist sort.
        
        
        int begin = 0;
        
        int end = books.size() - 1;
        while (begin <= end) {
            int mid = (end + begin) / 2;
            int val = books.get(mid).getId();
            
            if (val == searchedId) {
                
                return mid;
            }
            
            if (val < searchedId) {
                begin = mid + 1;
            }
            
            if (val > searchedId) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

}

