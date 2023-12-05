package cn.edu.bcu.eshop.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"cn.edu.bcu.eshop"})
public class WebAppStart {
    public static void main(String[] args) {
        SpringApplication.run(WebAppStart.class,args);
    }
}
