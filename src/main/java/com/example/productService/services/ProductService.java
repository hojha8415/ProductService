package com.example.productService.services;

import com.example.productService.Dto.ProductDto;
import org.springframework.web.bind.annotation.*;

public interface ProductService {
    String getAllProducts();
    String getSingleProduct(@PathVariable("productId") Long productId);
    String addNewProduct(@RequestBody ProductDto productDto);
    String updateProduct(@PathVariable("productId") Long productId);
    String deleteProduct(@PathVariable("productId") Long productId);
}
