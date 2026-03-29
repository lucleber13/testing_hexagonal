/**
 * Application use-case layer.
 *
 * <p>Coordinates domain services to fulfil higher-level application workflows
 * that span multiple aggregates or require cross-cutting application concerns
 * (e.g., transactions, event publishing, caching).
 *
 * <p>Classes here implement the input-port interfaces defined in
 * {@code domain.port.input} and delegate the actual domain logic to domain
 * services. They may also call output-port interfaces directly when needed.
 *
 * <p>Naming convention: {@code <Action><Entity>UseCaseImpl}
 * (e.g. {@code CreateUserUseCaseImpl}).
 */
package com.cbcode.hexagonalspringboottemplate.application.usecase;
