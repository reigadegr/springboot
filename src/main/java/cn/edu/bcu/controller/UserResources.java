package cn.edu.bcu.controller;

import cn.edu.bcu.eshop.domain.Tuser;
import cn.edu.bcu.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserResources {
    private final UserService userService;

    @Autowired
    public UserResources(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/api/v1/users")
    public ResponseEntity<HashMap> register(Tuser tUser) {
        HashMap<String, Object> resultMap = new HashMap<>();
        ResponseEntity responseEntity=null;
        try {
            int result = this.userService.register(tUser);
            if (result > 0) {
                resultMap.put("code", 1000);
                resultMap.put("msg", "注册成功");
                responseEntity = new ResponseEntity<HashMap>(resultMap, HttpStatus.OK);
            } else {
                resultMap.put("code", 1001);
                resultMap.put("msg", "注册失败");
                resultMap.put("des", "数据库更新失败");
                responseEntity = new ResponseEntity<HashMap>(resultMap, HttpStatus.NOT_IMPLEMENTED);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            resultMap.put("code", 1002);
            resultMap.put("msg", "注册失败");
            resultMap.put("des", "服务器程序出错");
            responseEntity = new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        finally {
            return responseEntity;
        }
    }


    @PostMapping(value="/api/v1/user")
    public ResponseEntity<HashMap> login(String userName,String psw){
        System.out.println("用户名："+userName);
        System.out.println("密码："+psw);
        return null;
    }
}

