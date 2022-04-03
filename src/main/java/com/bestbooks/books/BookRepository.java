package com.bestbooks.books;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class BookRepository {
    public List<Book> listAllBooks() {
        return Collections.emptyList();
    }

    public void create(Book book) {
        // .put(book.getId(), book)
    }

}
