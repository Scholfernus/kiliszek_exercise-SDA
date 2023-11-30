package org.example.profiles.command;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Order(1)
@Component
@Profile("!prod")
public class LocalCommand implements CommandLineRunner {
    @Value("local properties")
    private String overwritten;

    @Value("not extended or extended")
    private String extended;

    @Override
    public void run(String... args) throws Exception {
    log.info("LocalCommand {} {}",overwritten,extended);
    }
}
