package com.cbcode.hexagonalspringboottemplate.infrastructure.security.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * JWT configuration properties bound from {@code app.jwt.*} in application.yaml.
 *
 * <pre>
 * app:
 *   jwt:
 *     secret: ${JWT_SECRET}
 *     expiration-ms: 86400000 # 24 hours
 * </pre>
 */
@ConfigurationProperties(prefix = "app.jwt")
public record JwtProperties(
        String secret,
        long expirationMs
) {}
