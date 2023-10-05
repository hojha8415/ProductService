package com.example.productService.controllers;

import com.example.productService.Dto.ProductDto;
import com.example.productService.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
//add @RequestMapping("/products") --> to remove /products which is common to all
public class ProductControllerImpl implements com.example.productService.services.ProductService {
    private final ProductService productService;
    public ProductControllerImpl(ProductService productService){
        this.productService = productService;
    }
    @Override
    @GetMapping("/products")
    public String getAllProducts(){
        return "Getting all products";
    }
    @Override
    @GetMapping("/products/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId){
        return "Getting single product with id "+productId;
    }
    @Override
    @PostMapping("/products")
    public String addNewProduct(@RequestBody ProductDto productDto){
        return "adding new product " + productDto;
    }
    @Override
    @PutMapping("/products/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId){
        return "updating the product";
    }
    @Override
    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId){
        return "deleting the product";
    }
}
