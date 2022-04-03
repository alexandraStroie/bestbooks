package com.bestbooks.admin;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Administrator {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
