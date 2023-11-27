package org.example.scopeWebApi.config;

import org.example.scopeWebApi.examples.request.HelloMessageGenerator;
import org.example.scopeWebApi.examples.session.CurrentUser;
import org.example.scopeWebApi.examples.session.ItemService;
import org.example.scopeWebApi.examples.session.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class ExamplesConfig {
    @Bean
    @RequestScope
    public HelloMessageGenerator requestScopeBean() {
        return new HelloMessageGenerator();
    }

    @Bean
    public UserService userSessionScopeBean(CurrentUser currentUser) {
        return new UserService(currentUser);
    }

    public ItemService itemSessionScopedBean(CurrentUser currentUser) {
        return new ItemService(currentUser);
    }
}
