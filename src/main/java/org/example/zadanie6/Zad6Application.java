package org.example.zadanie6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Properties.class)
public class Zad6Application {
    public static void main(String[] args) {
        SpringApplication.run(Zad6Application.class, args);
    }
}
