package com.bestbooks.books;


import lombok.*;
import review.Review;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    static Long nbInstances = 1L;
    private Long id;
    private String title;
    private String author;
    private String description;
    private LocalDateTime publishedDate;
    private List<Review> reviewsList;
    private String category;
    private boolean isPublished;


    public Book(String title, String author, String description, LocalDateTime publishedDate, List<Review> reviewList, String category, boolean isPublished) {
        this.id = getNumberOfInstance();
        this.title = title;
        this.author = author;
        this.description = description;
        this.publishedDate = publishedDate;
        this.reviewsList = reviewList;
        this.category = category;
        this.isPublished = isPublished;
    }

    private Long getNumberOfInstance() {
        return nbInstances++;
    }
}
