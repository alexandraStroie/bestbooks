package com.bestbooks.user;

import com.bestbooks.loginAndRegistration.PasswordMatches;
import com.bestbooks.loginAndRegistration.ValidEmail;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@PasswordMatches
public class UserDto {

    @NotNull
    @NotEmpty
    String firstName;

    @NotNull
    @NotEmpty
    String lastName;

    @ValidEmail
    @NotNull
    @NotEmpty
    String email;

    @NotNull
    @NotEmpty
    String password;
    Long id;

    public String getMatchingPassword() {
        return "";
    }

//    public String getEmail() {
//        return "";
//    }
}
