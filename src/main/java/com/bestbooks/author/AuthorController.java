package com.bestbooks.author;

import com.bestbooks.books.BookDto;
import com.bestbooks.books.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private BooksService booksService;

    @GetMapping(value = "/allbookslist")
    public List<BookDto> getAllBooksFilteredByGenre(@RequestParam String genre) {
        return booksService.filterBooksByGenre(genre);
    }

    @GetMapping(value = "/allbookslistByAuthor")
    public List<BookDto> getAllBooksFilteredByGenre(@RequestParam Author authorName) {
        return booksService.filterBooksByAuthor(authorName.getFirstName());
    }

    //??? get all published books, filter by author name; first name, last?
    @GetMapping(value = "/allPublishedBooks")
    public List<BookDto> getAllPublishedBooks(@RequestParam Author authorName) {
        return booksService.filterBooksByAuthor(authorName.getFirstName());
    }

    @PostMapping(value = "addNewBook")
    public void addNewBook(BookDto bookDto) {
        booksService.addBook(bookDto);
    }

    //TO DO
    public void uploadProfilePicture() {

    }

    //TO DO
    public void uploadPdfBook() {

    }
}
