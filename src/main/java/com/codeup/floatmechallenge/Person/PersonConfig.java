package com.codeup.floatmechallenge.Person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            PersonRepository repository) {
        return args -> {
            Person patric = new Person(
                    "Patric",
                    24,
                    LocalDate.of(2022, Month.FEBRUARY, 22),
                    LocalDate.of(2022, Month.FEBRUARY, 22)
            );
            Person cam = new Person(
                    "cam",
                    24,
                    LocalDate.of(2022, Month.FEBRUARY, 22),
                    LocalDate.of(2022, Month.FEBRUARY, 22)
            );
               repository.saveAll(
                       List.of(patric, cam)
               );
        };
    }
}
