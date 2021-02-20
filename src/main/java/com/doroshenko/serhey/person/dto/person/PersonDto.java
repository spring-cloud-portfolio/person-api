package com.doroshenko.serhey.person.dto.person;

import com.doroshenko.serhey.person.dto.core.base.BaseDto;

import java.time.LocalDate;

/**
 * Data transfer object of person
 *
 * @author Serhey Doroshenko
 * @see BaseDto
 */
public class PersonDto extends BaseDto {

    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDay;

    /* Getters and setters */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

}
