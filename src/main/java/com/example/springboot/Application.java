package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication()

@EnableJpaAuditing(auditorAwareRef = "auditorAwareBeanMethod")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
