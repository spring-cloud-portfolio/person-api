package com.doroshenko.serhey.person.dto.person;

import com.doroshenko.serhey.person.dto.core.base.BaseDto;
import com.doroshenko.serhey.person.enumeration.person.Gender;
import com.doroshenko.serhey.person.enumeration.person.PersonType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.EnumSet;
import java.util.Set;

/**
 * Data transfer object of person
 *
 * @author Serhey Doroshenko
 * @see BaseDto
 */
public class PersonDto extends BaseDto {

    @NotNull
    private Gender gender;
    @NotBlank
    private String lastName;
    @NotBlank
    private String firstName;
    private String middleName;
    @NotNull
    private LocalDate birthDay;
    private Set<PersonType> personTypes;

    /* Getters and setters */
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

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

    public Set<PersonType> getPersonTypes() {
        if (personTypes == null) personTypes = EnumSet.noneOf(PersonType.class);
        return personTypes;
    }

}
