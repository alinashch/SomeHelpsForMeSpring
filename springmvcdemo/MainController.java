package com.example.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(Model page, @RequestParam (required = false) String name){

        page.addAttribute("name", name);
        page.addAttribute("color", "red");
        return  "home.html";
    }

}
