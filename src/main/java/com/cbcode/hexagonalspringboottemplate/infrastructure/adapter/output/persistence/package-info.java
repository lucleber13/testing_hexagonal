/**
 * Driven (output) persistence adapters.
 *
 * <p>Each adapter class implements one or more output-port interfaces from
 * {@code domain.port.output} using Spring Data JPA. The domain never sees
 * JPA entities; adapters map between them and domain model objects.
 *
 * <p>Naming convention: {@code <Entity>PersistenceAdapter}
 * (e.g. {@code UserPersistenceAdapter}).
 */
package com.cbcode.hexagonalspringboottemplate.infrastructure.adapter.output.persistence;
