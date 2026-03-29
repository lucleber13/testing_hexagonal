/**
 * Input ports (driving/primary ports).
 *
 * <p>Interfaces that define the use cases exposed by the domain to the outside
 * world. Controllers, CLI commands, and message consumers call these ports —
 * they never depend on the adapters directly.
 *
 * <p>Naming convention: {@code <Action><Entity>UseCase}
 * (e.g. {@code CreateUserUseCase}, {@code FindUserUseCase}).
 */
package com.cbcode.hexagonalspringboottemplate.domain.port.input;
