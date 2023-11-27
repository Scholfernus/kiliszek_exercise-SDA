package org.example.zadanie6;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Data
public class TestPropertiesCommand implements CommandLineRunner {

    private final Properties properties;
    @Override
    public void run(String... args) throws Exception {
    log.info(properties.toString());
    }
}
