package com.example.productService.services;

import org.springframework.web.bind.annotation.GetMapping;

public interface CategoryService {
    String getAllCategories();
    String getProductInCategory();
}
