package review;

import com.bestbooks.books.Book;
import com.bestbooks.user.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Review {

    static Long nbInstances = 1L;
    private LocalDateTime publishedTimestamp;
    private Long id;
    private Book book;
    private User author;
    private Long rating;
    private String comment;

    public Review(String comment, Long rating, User author, LocalDateTime publishedTimestamp, Book book) {
        this.id = id++;
        this.book = book;
        this.author = author;
        this.rating = rating;
        this.comment = comment;
        this.publishedTimestamp = publishedTimestamp;
    }


}
