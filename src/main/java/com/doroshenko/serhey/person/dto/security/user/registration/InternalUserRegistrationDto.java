package com.doroshenko.serhey.person.dto.security.user.registration;

import com.doroshenko.serhey.person.dto.person.PersonDto;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Data transfer object of user's registration
 *
 * @author Serhey Doroshenko
 * @see Serializable
 */
public class InternalUserRegistrationDto implements Serializable {

    @NotBlank
    private final String email;
    @NotBlank
    private final String username;
    @NotBlank
    private final String password;
    @Valid
    @NotNull
    private final PersonDto person;
    @NotBlank
    private final String mobilePhone;
    @NotBlank
    private final String passwordConfirmation;

    @JsonCreator
    public InternalUserRegistrationDto(@JsonProperty("email") String email,
                                       @JsonProperty("username") String username,
                                       @JsonProperty("password") String password,
                                       @JsonProperty("person") PersonDto person,
                                       @JsonProperty("mobilePhone") String mobilePhone,
                                       @JsonProperty("passwordConfirmation") String passwordConfirmation) {
        this.email = email;
        this.person = person;
        this.username = username;
        this.password = password;
        this.mobilePhone = mobilePhone;
        this.passwordConfirmation = passwordConfirmation;
    }

    /* Getters */
    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public PersonDto getPerson() {
        return person;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

}
