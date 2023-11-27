package org.example.scopeWebApi.examples.session;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ItemService {
    private final CurrentUser currentUser;

    public void publicItems() {
        log.info("Items for {}", currentUser.toString());
    }
}
