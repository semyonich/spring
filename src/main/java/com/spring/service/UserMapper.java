package com.spring.service;

import com.spring.dto.UserResponseDto;
import com.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponseDto makeDto(User user) {
        return new UserResponseDto(user.getId(), user.getName(), user.getEmail());
    }
}
