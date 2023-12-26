package cn.edu.bcu.eshop.service;


import cn.edu.bcu.eshop.domain.Tuser;
import cn.edu.bcu.eshop.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@MapperScan("cn.edu.bcu.eshop.mapper")
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int register(Tuser tUser) {
        return this.userMapper.addOne(tUser);
    }

    public int login (String userName,String psw){
        return this.userMapper.selectOne(userName,psw);
    }
}
