package com.doroshenko.serhey.person.dto.security.user;

import com.doroshenko.serhey.person.dto.core.base.BaseDto;
import com.doroshenko.serhey.person.dto.person.PersonDto;

/**
 * Data transfer object of user
 *
 * @author Serhey Doroshenko
 * @see BaseDto
 */
public class InternalUserDto extends BaseDto {

    private String username;
    private boolean enabled;
    private PersonDto person;

    /* Getters and setters*/
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

}
