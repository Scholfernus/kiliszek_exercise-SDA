package org.example.scopeWebApi.endpoint;

import lombok.RequiredArgsConstructor;
import org.example.scopeWebApi.examples.session.ItemService;
import org.example.scopeWebApi.examples.session.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SessionScopeController {
    private final UserService userService;
    private final ItemService itemService;

    @GetMapping("/scopes/session")
    public void getSessionScopeMessage(){
    userService.processUser();
    itemService.publicItems();
    }
}
