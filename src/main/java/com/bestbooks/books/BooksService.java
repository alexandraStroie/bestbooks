package com.bestbooks.books;

import com.bestbooks.author.Author;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class BooksService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookDto> filterBooksByGenre(String genre) {
        Predicate<Book> byGenre = book -> book.getGenre().equalsIgnoreCase(genre);
        return bookRepository.listAllBooks()
                .stream()
                .filter(byGenre)
                .map(book -> new ModelMapper().map(book, BookDto.class))
                .collect(Collectors.toList());
    }

    public List<BookDto> filterBooksByAuthor(String author) {
        Predicate<Book> byAuthor = book -> book.getGenre().equalsIgnoreCase(String.valueOf(author));
        return bookRepository.listAllBooks()
                .stream()
                .filter(byAuthor)
                .map(book -> new ModelMapper().map(book, BookDto.class))
                .collect(Collectors.toList());
    }

    public void addBook(BookDto bookDto) {
        bookRepository.create(new ModelMapper().map(bookDto, Book.class));
    }
}
