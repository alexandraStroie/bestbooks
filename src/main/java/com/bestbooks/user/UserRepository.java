package com.bestbooks.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public User findByEmail(String email) {
        return new User();
    }

    public User save(User user) {
        return new User();
    }

    //to do
    public Optional<User> findById(long id) {
        return Optional.of(new User());
    }
}
