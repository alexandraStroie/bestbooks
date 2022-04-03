package com.bestbooks.reader;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class Reader {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<String> readBooks;
    private List<String> reviews;
    private List<String> wishList;
}
