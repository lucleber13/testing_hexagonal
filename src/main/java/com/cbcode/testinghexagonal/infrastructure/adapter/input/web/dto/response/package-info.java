/**
 * Outbound DTO (response body) classes returned by REST controllers.
 *
 * <p>These are serialized to JSON and returned wrapped in
 * {@link com.cbcode.testinghexagonal.shared.response.ApiResponse}.
 * They must not expose internal domain or JPA entity state directly.
 *
 * <p>Naming convention: {@code <Entity>Response}
 * (e.g. {@code UserResponse}, {@code TokenResponse}).
 */
package com.cbcode.testinghexagonal.infrastructure.adapter.input.web.dto.response;
