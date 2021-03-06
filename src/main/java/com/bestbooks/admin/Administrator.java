package com.bestbooks.admin;

import com.bestbooks.user.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Administrator extends User {

    public Administrator(String email, String password, String firstName, String lastName) {
        super(email,password,firstName,lastName);
    }
}
