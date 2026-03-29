package com.cbcode.hexagonalspringboottemplate.domain.exception;

/**
 * Thrown when a requested domain entity cannot be found.
 */
public class EntityNotFoundException extends DomainException {

    public EntityNotFoundException(String entity, Object id) {
        super(entity + " with id '" + id + "' was not found");
    }

    public EntityNotFoundException(String message) {
        super(message);
    }
}
