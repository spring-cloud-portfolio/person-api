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

    /**
     * Getter for identifier
     *
     * @return {@code Long}
     */
    Long getId();

    /**
     * Setter for identifier
     *
     * @param id identifier, could be null
     */
    void setId(Long id);

    /**
     * Utility method to define is the entity new or already persisted in database
     *
     * @return {@code boolean true} if entity does not persisted
     */
    boolean isNew();

}
