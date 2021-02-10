package com.spring.service;

import com.spring.dto.UserResponseDto;
import com.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponseDto makeDto(User user) {
        UserResponseDto dtoUser = new UserResponseDto();
        dtoUser.setId(user.getId());
        dtoUser.setName(user.getName());
        dtoUser.setEmail(user.getEmail());
        return dtoUser;
    }
}
