/**
 * Mappers between JPA entities and domain model objects.
 *
 * <p>Isolates the persistence model from the domain model so that schema
 * changes don't ripple into the domain and vice versa.
 *
 * <p>Naming convention: {@code <Entity>PersistenceMapper}
 * (e.g. {@code UserPersistenceMapper}).
 */
package com.cbcode.testinghexagonal.infrastructure.adapter.output.persistence.mapper;
