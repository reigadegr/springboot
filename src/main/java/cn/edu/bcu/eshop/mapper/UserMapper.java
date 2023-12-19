package cn.edu.bcu.eshop.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import cn.edu.bcu.eshop.domain.TUser;

@Mapper
public interface UserMapper {

	@Insert("insert into t_user(user_name,psw,phone,address) values("
			+ "#{userName},#{psw},#{phone},#{address})")
	public int addOne(TUser tUser);
}
