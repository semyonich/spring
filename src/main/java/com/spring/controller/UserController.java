package com.spring.controller;

import com.spring.dto.UserResponseDto;
import com.spring.model.User;
import com.spring.service.UserMapper;
import com.spring.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/inject")
    public String injectUsers() {
        User user = new User();
        user.setName("Bob");
        user.setEmail("bob@gmail.com");
        userService.add(user);
        user = new User();
        user.setName("Alice");
        user.setEmail("alice@gmail.com");
        userService.add(user);
        user = new User();
        user.setName("John");
        user.setEmail("john@gmail.com");
        userService.add(user);
        user = new User();
        user.setName("Bruce");
        user.setEmail("bruce@gmail.com");
        userService.add(user);
        return "All users were injected into DB successfully!";
    }

    @GetMapping("/{userId}")
    public UserResponseDto get(@PathVariable("userId") Long userId) {
        User user = userService.get(userId);
        return userMapper.makeDto(user);
    }

    @GetMapping("/")
    List<UserResponseDto> getAll() {
        return userService.listUsers().stream()
                .map(userMapper::makeDto)
                .collect(Collectors.toList());
    }
}
