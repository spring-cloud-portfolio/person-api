package com.doroshenko.serhey.person.filter.person;

import com.doroshenko.serhey.person.dto.core.base.BaseQueryFilter;
import com.doroshenko.serhey.person.enumeration.person.Gender;
import com.doroshenko.serhey.person.enumeration.person.PersonType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Set;

/**
 * Extension of {@link BaseQueryFilter} to add filtration capabilities of persons list
 *
 * @author Serhey Doroshenko
 * @see BaseQueryFilter
 */
public class PersonQueryFilter extends BaseQueryFilter {

    private final Gender gender;
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final LocalDate birthDay;
    private final Set<PersonType> personTypes;

    @JsonCreator
    protected PersonQueryFilter(@JsonProperty("page") int page,
                                @JsonProperty("size") int size,
                                @JsonProperty("gender") Gender gender,
                                @JsonProperty("lastName") String lastName,
                                @JsonProperty("firstName") String firstName,
                                @JsonProperty("birthDay") LocalDate birthDay,
                                @JsonProperty("middleName") String middleName,
                                @JsonProperty("descending") boolean descending,
                                @JsonProperty("sortingField") String sortingField,
                                @JsonProperty("personTypes") Set<PersonType> personTypes) {
        super(page, size, descending, sortingField);
        this.gender = gender;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.firstName = firstName;
        this.middleName = middleName;
        this.personTypes = personTypes;
    }

    /* Getters */
    public Gender getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Set<PersonType> getPersonTypes() {
        return personTypes;
    }

}
