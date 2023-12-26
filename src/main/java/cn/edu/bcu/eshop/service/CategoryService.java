package cn.edu.bcu.eshop.service;


import cn.edu.bcu.eshop.domain.TCategory;
import cn.edu.bcu.eshop.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryService {
    private final CategoryMapper categoryMapper;
    @Autowired
    public CategoryService(CategoryMapper categoryMapper){
        this.categoryMapper=categoryMapper;
    }


    //获取一级分类
    public ArrayList<TCategory> getAllFirstCategories(){
        return this.categoryMapper.findAllFirst();
    }
}
