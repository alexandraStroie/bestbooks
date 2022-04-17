package com.bestbooks.user;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User registerNewUserAccount(UserDto userDto);

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(User user);


    User findUserByEmail(String email);

    Optional<User> getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    String validateVerificationToken(String token);

    List<String> getUsersFromSessionRegistry();

    void addUserLocation(User user, String ip);

}
