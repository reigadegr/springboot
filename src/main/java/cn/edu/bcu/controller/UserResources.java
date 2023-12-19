package cn.edu.bcu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserResources {
    @PostMapping(value="/api/v1/users")
    public ResponseEntity<HashMap> register(){
        HashMap<String,Object> resultMap=new HashMap<>();
        resultMap.put("code",1000);
        resultMap.put("msg","注册成功");
        return new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
    }
//    @GetMapping(value = "/showlogin") public String showLoginView()
//    {
//        return "login";
//    }

}
