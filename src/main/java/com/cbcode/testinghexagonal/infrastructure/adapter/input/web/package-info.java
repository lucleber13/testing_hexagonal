/**
 * Driving (input) web adapters — REST controllers.
 *
 * <p>Each controller implements one or more input ports from
 * {@code domain.port.input}. Controllers must not contain business logic;
 * they translate HTTP requests into use-case calls and wrap results in
 * {@link com.cbcode.testinghexagonal.shared.response.ApiResponse}.
 *
 * <p>Naming convention: {@code <Entity>Controller}
 */
package com.cbcode.testinghexagonal.infrastructure.adapter.input.web;
