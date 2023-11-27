package org.example.scopeWebApi.endpoint;

import org.example.scopeWebApi.examples.request.HelloMessageGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RequestScopeController {
    @Resource(name = "requestScopeBean")
    HelloMessageGenerator requestScopeBean;

    @GetMapping("/scopes/request")
    public String getRequestScopeMessage() {
        return requestScopeBean.toString();
    }
}
