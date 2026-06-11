package com.goal.miniPharos.domain.user;

public class UserMapper {

    public static User toEntity(UserRequest userRequest) {
        return User.builder()
                .name(userRequest.name())
                .login(userRequest.login())
                .password(userRequest.password())
                .build();
        }

    public static UserResponse toResponse(User user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getLogin()
        );
    }
}
