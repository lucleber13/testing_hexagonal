package com.cbcode.testinghexagonal.infrastructure.config;

import com.cbcode.testinghexagonal.infrastructure.security.jwt.JwtProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Central Spring application configuration.
 * Register application-wide beans here (encoders, mappers, etc.).
 */
@Configuration
@EnableConfigurationProperties(JwtProperties.class)
public class ApplicationConfig {

    /**
     * Argon2 password encoder (recommended over BCrypt for new projects).
     * Requires the {@code bcprov-jdk18on} dependency on the classpath.
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return Argon2PasswordEncoder.defaultsForSpringSecurity_v5_8();
    }
}
