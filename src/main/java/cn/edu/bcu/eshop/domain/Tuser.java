package cn.edu.bcu.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tuser {
    private Integer id;
    private String userName;
    private String psw;
    private String phone;
    private String address;


}
