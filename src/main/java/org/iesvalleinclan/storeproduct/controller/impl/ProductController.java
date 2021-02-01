package org.iesvalleinclan.storeproduct.controller.impl;

import org.iesvalleinclan.storeproduct.controller.ProductAPI;
import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.iesvalleinclan.storeproduct.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController implements ProductAPI {

    @Autowired
    private ProductService productService;

    @Override
    @GetMapping
    public List<ProductVO> findAll() {
        return productService.findAll();
    }

    @Override
    @PostMapping
    public ProductVO create(@RequestBody ProductVO city) {
        return productService.create(city);
    }
}