package com.cbcode.hexagonalspringboottemplate.infrastructure.security.jwt;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * Contract for JWT token operations.
 */
public interface JwtService {

    /** Generate a signed JWT for the given user. */
    String generateToken(UserDetails userDetails);

    /** Extract the username (subject) from a JWT. */
    String extractUsername(String token);

    /** Return {@code true} if the token is valid and belongs to {@code userDetails}. */
    boolean isTokenValid(String token, UserDetails userDetails);
}
