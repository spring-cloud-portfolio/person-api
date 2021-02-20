package com.doroshenko.serhey.person.dto.core.api;

import java.io.Serializable;

/**
 * Intended for entities and DTOs whose id is {@link Long}
 *
 * @author Serhey Doroshenko
 */
public interface Identifiable extends Serializable {

    /**
     * Determine the minimum id value
     */
    int MIN_ID = 1;

    Long getId();

    void setId(Long id);

    boolean isNew();

}
