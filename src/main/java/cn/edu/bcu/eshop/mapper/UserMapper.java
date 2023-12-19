package cn.edu.bcu.eshop.mapper;


import cn.edu.bcu.eshop.domain.Tuser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
//@MapperScan("cn.edu.bcu.eshop.mapper")
public interface UserMapper {

@Insert("insert into t_user(user_name,psw,phone,address) values("+"#{userName},#{psw},#{phone},#{address})")
    public int addOne(Tuser tUser);
}
