package com.doroshenko.serhey.person.dto.core.base;

import com.doroshenko.serhey.person.dto.core.api.Identifiable;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Base representation of data transfer object with id of type {@link Long}
 *
 * @author Serhey Doroshenko
 * @see Identifiable
 */
public abstract class BaseDto implements Identifiable {

    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    @JsonIgnore
    public boolean isNew() {
        return id == null;
    }

}
