package com.example.springmvcdemo;

import com.example.springmvcdemo.service.LoggedUserManagementService;
import com.example.springmvcdemo.service.LoginCountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MController {
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    public MController(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/main")
    public String getMain(@RequestParam(required = false) String logout, Model model){
        if(logout!=null){
            loggedUserManagementService.setName(null);
        }
        int count=loginCountService.getCount();
        String name=loggedUserManagementService.getName();

        model.addAttribute("name", name);
        model.addAttribute("count", count);

        return "main.html";
    }
}
