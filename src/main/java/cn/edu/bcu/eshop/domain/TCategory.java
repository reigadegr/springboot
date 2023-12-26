package cn.edu.bcu.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TCategory {
    private Integer cagetoryId;
    private Integer status;
    private Integer dependId;
    private String categoryName;
    private String style;
    private String imgUrl;
}
