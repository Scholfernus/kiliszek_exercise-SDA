package org.example.profiles.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Order(2)
@Component
public class DefaultCommand implements CommandLineRunner {

    @Value("${org.example.profiles.command.overwritten}")
    private String overwritten;

    @Value("${org.example.profiles.command.extended}")
    private String extended;

    // Dodatkowe możliwości @Value
    @Value("#{'${spring.profiles.active:unknown}'.split(',')}")
    public List<String> activeProfile;

    @Override
    public void run(String... args) throws Exception {
        log.info("Default command {} {} {}", overwritten, extended, activeProfile);
    }
}
