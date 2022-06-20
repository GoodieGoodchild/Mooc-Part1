
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Book {

    String title;
    int numPages;
    int publicationYear;
    
    public Book(String title, int numPages, int publicationYear) {
        this.title = title;
        this.numPages = numPages;
        this.publicationYear = publicationYear;
    }
    
    public String getName() {
        return this.title;
    }
    
    public int getPages() {
        return this.numPages;
    }
    
    public int getPublicationYear() {
        return this.publicationYear;
    }
        
}
