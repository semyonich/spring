package com.spring;

import com.spring.config.AppConfig;
import com.spring.model.User;
import com.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(new User("Bob", "bob@gmail.com"));
        userService.add(new User("Alice", "alice@gmail.com"));
        userService.listUsers().forEach(System.out::println);
    }
}
