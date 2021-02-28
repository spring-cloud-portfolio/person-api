package com.doroshenko.serhey.person.filter.security.user;

import com.doroshenko.serhey.person.dto.core.base.BaseQueryFilter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Extension of {@link BaseQueryFilter} to add filtration capabilities of users list
 *
 * @author Serhey Doroshenko
 * @see BaseQueryFilter
 */
public class InternalUserQueryFilter extends BaseQueryFilter {

    private final String username;

    @JsonCreator
    public InternalUserQueryFilter(@JsonProperty("page") int page,
                                   @JsonProperty("size") int size,
                                   @JsonProperty("username") String username,
                                   @JsonProperty("descending") boolean descending,
                                   @JsonProperty("sortingField") String sortingField) {
        super(page, size, descending, sortingField);
        this.username = username;
    }

    /* Getters */
    public String getUsername() {
        return username;
    }

}
