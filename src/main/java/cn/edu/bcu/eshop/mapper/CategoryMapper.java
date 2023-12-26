package cn.edu.bcu.eshop.mapper;

import cn.edu.bcu.eshop.domain.TCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface CategoryMapper {

    //@Select("select *from t_category where status=0");
    public ArrayList<TCategory> findAllFirst();
}
