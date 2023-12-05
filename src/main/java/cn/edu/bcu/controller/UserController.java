package cn.edu.bcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping(value = "/showlogin") public String showLoginView()
    {
        return "login";
    }
}
