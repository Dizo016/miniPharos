package com.goal.miniPharos.domain.user;

import jakarta.validation.constraints.NotBlank;

public record UserRequest(
        @NotBlank String name,
        @NotBlank String login,
        @NotBlank String password
) {}
