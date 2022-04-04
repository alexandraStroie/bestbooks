package com.bestbooks.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class User {

    Long id;
    static Long nrOfInstances = 1L;
    String firstName;
    String lastName;
    String email;
    String password;
    UserType userType;

    public User(String firstName, String lastName, String mail, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = mail;
        this.password = password;
        this.id = getNrOfInstances();
    }

    private Long getNrOfInstances() {
        return nrOfInstances++;
    }

    public void setRoles(List<String> role_user) {
    }
}
