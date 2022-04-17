package com.bestbooks.author;

import com.bestbooks.books.Book;
import com.bestbooks.user.User;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Author extends User {

    private List<Book> publishedBooks;

    public Author(String email, String password, String firstName, String lastName, List<Book> publishedBooks) {
        super(email,password,firstName,lastName);
        this.publishedBooks = publishedBooks;
    }
}
