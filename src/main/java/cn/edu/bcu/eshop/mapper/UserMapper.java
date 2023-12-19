package cn.edu.bcu.eshop.mapper;


import cn.edu.bcu.eshop.domain.Tuser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

@Insert("insert into t_user(user_name,psw,phone,address) values("+"#{userName},#{psw},#{phone},#{address})")
    public int addOne(Tuser tUser);
}
