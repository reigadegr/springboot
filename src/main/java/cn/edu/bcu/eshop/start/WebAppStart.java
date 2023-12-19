package cn.edu.bcu.eshop.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"cn.edu.bcu.eshop"})
@MapperScan(basePackages="cn.edu.bcu.eshop.mapper")
public class WebAppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(WebAppStart.class, args);
	}

}
