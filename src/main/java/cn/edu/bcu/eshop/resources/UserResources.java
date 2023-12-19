package cn.edu.bcu.eshop.resources;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bcu.eshop.domain.TUser;
import cn.edu.bcu.eshop.service.UserService;

@RestController
public class UserResources {
	private final UserService userService;
	
	@Autowired
	public UserResources(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping(value="/api/v1/users")
	public ResponseEntity<HashMap> register(TUser tUser){
		HashMap<String,Object> resultMap = new HashMap<>();
		ResponseEntity responseEntity = null;
		
		try {
			int result = this.userService.register(tUser);
			if(result>0) {
				resultMap.put("code", 1000);
				resultMap.put("msg", "注册成功");
				responseEntity = new ResponseEntity<HashMap>(resultMap,HttpStatus.OK);
			}else {
				resultMap.put("code", 1001);
				resultMap.put("msg", "注册失败");
				resultMap.put("des", "数据库更新失败");
				responseEntity = new ResponseEntity<HashMap>(resultMap,HttpStatus.NOT_IMPLEMENTED);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			resultMap.put("code", 1002);
			resultMap.put("msg", "注册失败");
			resultMap.put("des", "服务器程序出现错误");
			responseEntity = new ResponseEntity(resultMap,HttpStatus.INTERNAL_SERVER_ERROR);
		}finally {
			return responseEntity;
		}
		
	}
	
}
