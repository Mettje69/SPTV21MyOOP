/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;

/**
 *
 * @author Anatoli
 */
public class Book {
    private Author[] authors;
    private String caption;

    public Book() {
        authors = new Author[0];
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    
    public void addAuthor(Author author){
        //Copy authors into newAuthors, where in one place more
        //Add in this place author from methods parametors
        //Copy link newAuthors into authors
        
        Author[] newAuthors = Arrays.copyOf(authors, authors.length+1);
        newAuthors[newAuthors.length - 1] = author;
        authors = newAuthors;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "Book{" 
                + "authors=" + Arrays.toString(authors) 
                + ", caption=" + caption 
                + '}';
    }
    
    
}
