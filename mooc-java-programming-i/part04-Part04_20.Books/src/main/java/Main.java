import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    
    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        // Title: To Kill a Mockingbird
        // Pages: 281
        // Publication year: 1960
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        Book book;
        
        System.out.println("Title: ");
        String title = scanner.nextLine();
        
        while (true) {
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            book = new Book(title, pages, pubYear);
            library.add(book);
            
            System.out.println("Title: ");
            title = scanner.nextLine();
        }
        
        System.out.println("What information will be printed?" );
        String condition = scanner.nextLine();
        
       
        
            if (condition.equals("everything")) {
                for(int i = 0; i < library.size(); i++) {
                    System.out.println(library.get(i).getName() + ", " + library.get(i).getPages() + " pages, " + library.get(i).getPublicationYear());
                }
            }
            
            if (condition.equals("name")) {
                for(int i = 0; i < library.size(); i++) {
                    System.out.println("Title: " + library.get(i).getName());                             
                }
            }

    }
}
