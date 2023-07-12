package com.example.kdeokar.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/welcome")
    @ResponseBody
    public String sayHello() {
        return "welcome.";
    }

}
