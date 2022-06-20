
import java.util.Objects;


public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }
    
    public boolean equals(Object book) {
        if (this == book) {
            return true;
        }
        
        if (!(book instanceof Object)) {
            return false;
        }
        
        Book bookBeingChecked = (Book) book;
        
        return name.equals(bookBeingChecked.name) && Objects.equals(publicationYear, bookBeingChecked.publicationYear);
    }

}
