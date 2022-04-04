package com.bestbooks.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    public void create(User user) {
        // .put(user.getId())
    }

    public void update(User user) {
        //
    }

    // to do
    public User getUser(Long id){
//        return .getUser().getId();
        return new User();
    }

    public List<User> getAllUsers(){
        List<User> userList = new ArrayList<>();
        return userList;
    }

    public void delete(User user) {
        // .remove
    }

    public String findByEmail(String email) {
        return "";
    }

    public User save(User user) {
        return new User();
    }
}
