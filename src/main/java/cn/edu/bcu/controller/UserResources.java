package cn.edu.bcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserResources {
    @PostMapping(value="/api/vi/users")
    public HashMap<String,Object> register(){
        HashMap<String,Object> resultMap=new HashMap<>();
        resultMap.put("code",1000);
        resultMap.put("msg","注册成功");
        return resultMap;
    }
//    @GetMapping(value = "/showlogin") public String showLoginView()
//    {
//        return "login";
//    }
}
