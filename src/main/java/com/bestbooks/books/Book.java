package com.bestbooks.books;


import com.bestbooks.author.Author;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Author author;
    private String genre;
    private String title;
    private int pageNr;
    private String publicationYear;
    private String description;

}
