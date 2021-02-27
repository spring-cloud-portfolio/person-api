package com.doroshenko.serhey.person.dto.core.base;

/**
 * Base data object to use in SQL queries for pagination and filtration
 *
 * @author Serhey Doroshenko
 */
public abstract class BaseQueryFilter {

    private final int page;
    private final int size;
    private final boolean descending;
    private final String sortingField;

    protected BaseQueryFilter(int page,
                              int size,
                              boolean descending,
                              String sortingField) {
        this.page = page;
        this.size = size;
        this.descending = descending;
        this.sortingField = sortingField;
    }

    /* Getters */
    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public boolean isDescending() {
        return descending;
    }

    public String getSortingField() {
        return sortingField;
    }

}
