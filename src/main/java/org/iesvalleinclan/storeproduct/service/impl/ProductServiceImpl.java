package org.iesvalleinclan.storeproduct.service.impl;

import org.iesvalleinclan.storeproduct.service.ProductService;
import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.iesvalleinclan.storeproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductVO> findAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductVO create(ProductVO product) {
        return productRepository.insert(product);
    }
}