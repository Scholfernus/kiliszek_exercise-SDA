package org.example.scopeWebApi.examples.session;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CurrentUser {
}
