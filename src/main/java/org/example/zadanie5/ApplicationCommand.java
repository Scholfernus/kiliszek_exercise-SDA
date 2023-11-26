package org.example.zadanie5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ApplicationCommand implements CommandLineRunner {
    private final WelcomeMessageLogger logger;

    public ApplicationCommand(WelcomeMessageLogger logger) {
        this.logger = logger;
    }

    @Override
    public void run(String... args) throws Exception {
        if (logger.getShouldLog()) {
            log.info(logger.getText());
        }
    }
}
