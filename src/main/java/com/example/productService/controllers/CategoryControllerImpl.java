package com.example.productService.controllers;

import com.example.productService.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //allows the class to serve APIs , normal @controller would just create beans
public class CategoryControllerImpl implements com.example.productService.services.CategoryService {
    private final CategoryService categoryService;
    CategoryControllerImpl(CategoryService categoryService){
        this.categoryService = categoryService;
    }
    @Override
    @GetMapping("/products/categories")
    public String getAllCategories(){
        return "Getting all categories";
    }
    @Override
    public String getProductInCategory(){
        return "Get products in category";
    }

}
