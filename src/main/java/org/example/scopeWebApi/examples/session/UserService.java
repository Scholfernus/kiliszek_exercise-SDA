package org.example.scopeWebApi.examples.session;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final CurrentUser currentUser;

    public void processUser() {
        log.info("processUser user: {}", currentUser.toString());
    }
}
