package com.example.springmvcdemo.model;

import com.example.springmvcdemo.service.LoggedUserManagementService;
import com.example.springmvcdemo.service.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope// один
public class LoginProcessor {
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;
    private String name;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    public boolean login(){
        loginCountService.inc();
        String name=this.getName();
        String password=this.getPassword();
        boolean logRes=false;
        if("natalie". equals(name) && "password".equals(password)){
            logRes=true;
            loggedUserManagementService.setName(name);
            return  true;
        }
        return logRes;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
