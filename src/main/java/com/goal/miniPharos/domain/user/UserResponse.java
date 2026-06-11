package com.goal.miniPharos.domain.user;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String name,
        String login
) {}
