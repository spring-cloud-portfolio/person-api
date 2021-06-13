package com.doroshenko.serhey.person.dto.security.user.registration;

import com.doroshenko.serhey.person.enumeration.person.Gender;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Data transfer object of user's registration
 *
 * @author Serhey Doroshenko
 * @see Serializable
 */
public class InternalUserRegistrationDto implements Serializable {

    private final String email;
    private final Gender gender;
    private final String username;
    private final String password;
    private final String mobilePhone;
    private final String passwordConfirmation;

    @JsonCreator
    public InternalUserRegistrationDto(@JsonProperty("email") String email,
                                       @JsonProperty("gender") Gender gender,
                                       @JsonProperty("username") String username,
                                       @JsonProperty("password") String password,
                                       @JsonProperty("mobilePhone") String mobilePhone,
                                       @JsonProperty("passwordConfirmation") String passwordConfirmation) {
        this.email = email;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.mobilePhone = mobilePhone;
        this.passwordConfirmation = passwordConfirmation;
    }

    /* Getters */
    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

}
