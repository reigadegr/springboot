package cn.edu.bcu.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.eshop.domain.TUser;
import cn.edu.bcu.eshop.mapper.UserMapper;

@Service
public class UserService {
	private final UserMapper userMapper;
	
	@Autowired
	public UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	public int register(TUser tUser) {
		return this.userMapper.addOne(tUser);
	}
}
