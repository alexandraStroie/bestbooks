package com.bestbooks.author;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class Author {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<String> publishedBooks;
}
