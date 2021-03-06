package com.buddylogin.demo.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner1(UserRepository repository){
        return args -> {
            User user1 = new User(
                    "hellokitty98",
                    "kitty@gmail.com",
                    "meow",
                    "Beginner",
                    1
            );

            repository.saveAll(
                    List.of(user1)
            );

        };
    }
}
