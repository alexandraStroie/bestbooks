package com.bestbooks.author;

import com.bestbooks.books.BookDto;
import com.bestbooks.books.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private BooksService bookService;

    //???
    public List<BookDto> getAllPublishedBooks(){
        return bookService.filterBooksByAuthor("");

    }
}
