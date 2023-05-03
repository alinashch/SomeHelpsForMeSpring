package com.example.springmvcdemo;

import com.example.springmvcdemo.model.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public  String loginSet(){
        return "login.html";
    }


    @PostMapping("/")
    public  String loginGEt(@RequestParam String name, @RequestParam String password, Model model){
        loginProcessor.setName(name);
        loginProcessor.setPassword(password);
        boolean log=loginProcessor.login();
        if (log){
            model.addAttribute("message", "true");

            return  "redirect:/main";

        }else {
            model.addAttribute("message", "false");

        }
        return "login.html";
    }
}
