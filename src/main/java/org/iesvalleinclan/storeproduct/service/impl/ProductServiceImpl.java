package org.iesvalleinclan.storeproduct.service.impl;

import org.apache.commons.lang3.RandomStringUtils;
import org.iesvalleinclan.storeproduct.model.dto.ProductDTO;
import org.iesvalleinclan.storeproduct.service.ProductService;
import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.iesvalleinclan.storeproduct.repository.ProductRepository;
import org.iesvalleinclan.storeproduct.service.converter.ProductConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductConverter productConverter;

    @Override
    public List<ProductDTO> obtainAll() {
        return productConverter.convertVOListToDTOList(productRepository.findAll());
    }

    @Override
    public ProductDTO create(final ProductDTO product) {
        product.setReference(RandomStringUtils.randomAlphabetic(10));
        return productConverter.convertToDTO(productRepository.save(productConverter.convertToVO(product)));
    }

    @Override
    @Transactional
    public ProductDTO modify(final ProductDTO product) {
        ProductVO productVo = productConverter.convertToVO(product);
        return productConverter.convertToDTO(productRepository.save(productVo));
    }

    @Override
    @Transactional
    public ProductDTO disable(final String reference) {
        return productConverter.convertToDTO(productRepository.disable(reference));
    }


    public ProductDTO findProduct(final String reference) {
        return productConverter.convertToDTO(productRepository.findProduct(reference));
    }

}