/**
 * Inbound DTO (request body) classes for REST controllers.
 *
 * <p>Use Jakarta Validation annotations ({@code @NotBlank}, {@code @Email}, etc.)
 * on these records/classes. They must not leak into the domain layer.
 *
 * <p>Naming convention: {@code <Action><Entity>Request}
 * (e.g. {@code CreateUserRequest}, {@code LoginRequest}).
 */
package com.cbcode.hexagonalspringboottemplate.infrastructure.adapter.input.web.dto.request;
