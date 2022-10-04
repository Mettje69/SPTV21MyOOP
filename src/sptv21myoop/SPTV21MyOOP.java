/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21myoop;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author Anatoli
 */
public class SPTV21MyOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstname("Aleksandr");
        author1.setLastname("Pushkin");
        Book book1 = new Book();
        book1.setCaption("Jevgeny Onegin");
        Author[] authors = new Author[1];
        authors[0] = author1;
        book1.setAuthors(authors);
        System.out.println(book1.toString());
    }
    
}
