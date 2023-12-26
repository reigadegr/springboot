package cn.edu.bcu.Resources;

import cn.edu.bcu.eshop.domain.TCategory;
import cn.edu.bcu.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class CategoryResources {
    private final CategoryService categoryService;
    @Autowired
    public CategoryResources(CategoryService categoryService){
        this.categoryService=categoryService;
    }

    @GetMapping (value="/api/v1/firstcategories")
    public ResponseEntity<HashMap> getAllFirstCategories() {
        HashMap<String, Object> resultMap = new HashMap<>();
        ResponseEntity responseEntity=null;
        ArrayList<TCategory> resultArraylist=new ArrayList<>();
        try {
            resultArraylist = this.categoryService.getAllFirstCategories();
            resultMap.put("code", 1000);
            resultMap.put("data",resultArraylist);
            responseEntity=new ResponseEntity<HashMap>(resultMap,HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            resultMap.put("code", 1001);
            resultMap.put("msg", "查询失败");
            resultMap.put("des", "服务器程序出错");
            responseEntity = new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        finally {
            return responseEntity;
        }
    }
}
