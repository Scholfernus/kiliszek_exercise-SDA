package org.example.zadanie5;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Getter
@Slf4j
@Component
public class WelcomeMessageLogger {
    private String text;
    private Boolean shouldLog;

    public WelcomeMessageLogger(
            @Value("${pl.sdacademy.welcome.text.value:none}") String text,
            @Value("${pl.sdacademy.welcome.text.enable}") Boolean shouldLog) {
        this.text = text;
        this.shouldLog = shouldLog;
    }

}
