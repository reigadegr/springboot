package cn.edu.bcu.eshop.service;


import cn.edu.bcu.eshop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper userMapper;
    @Autowired
    public UserService( UserMapper userMapper){
        this.userMapper=userMapper;
    }

}
