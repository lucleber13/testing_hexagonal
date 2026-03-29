package com.cbcode.hexagonalspringboottemplate.domain.exception;

/**
 * Base class for all domain exceptions.
 * Extend this for every business-rule violation in the domain layer.
 */
public abstract class DomainException extends RuntimeException {

    protected DomainException(String message) {
        super(message);
    }

    protected DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
