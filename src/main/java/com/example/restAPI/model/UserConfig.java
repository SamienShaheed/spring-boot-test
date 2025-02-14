package com.example.restAPI.model;

import com.example.restAPI.interfaces.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            Users samien = new Users(
                    "Samien",
                    "test@test.com"
            );

            Users shaheed = new Users(
                    "Shaheed",
                    "test2@test.com"
            );

            repository.saveAll( List.of(samien, shaheed));
        };
    }

}
