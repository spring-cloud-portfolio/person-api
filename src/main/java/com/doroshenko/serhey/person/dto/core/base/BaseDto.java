package com.doroshenko.serhey.person.dto.core.base;

import com.doroshenko.serhey.person.dto.core.api.Identifiable;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
