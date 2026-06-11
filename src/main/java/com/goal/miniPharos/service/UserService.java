package com.goal.miniPharos.service;

import com.goal.miniPharos.domain.user.User;
import com.goal.miniPharos.domain.user.UserMapper;
import com.goal.miniPharos.domain.user.UserRequest;
import com.goal.miniPharos.domain.user.UserResponse;
import com.goal.miniPharos.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserResponse createUser(UserRequest userRequest) {
        User user  = UserMapper.toEntity(userRequest);
        user.setPassword(passwordEncoder.encode(userRequest.password()));
        return UserMapper.toResponse(user);
    }
}
