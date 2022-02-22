package com.codeup.floatmechallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FloatmeChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FloatmeChallengeApplication.class, args);
    }

}
