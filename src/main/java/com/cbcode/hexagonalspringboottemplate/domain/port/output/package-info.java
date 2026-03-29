/**
 * Output ports (driven/secondary ports).
 *
 * <p>Interfaces that the domain requires from the infrastructure (persistence,
 * messaging, external APIs). The domain defines these contracts; the
 * infrastructure adapters implement them.
 *
 * <p>Naming convention: {@code <Entity>Repository} for persistence,
 * {@code <Entity>Gateway} for external services.
 */
package com.cbcode.hexagonalspringboottemplate.domain.port.output;
