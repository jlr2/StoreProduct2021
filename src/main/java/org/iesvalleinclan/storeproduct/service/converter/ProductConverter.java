package org.iesvalleinclan.storeproduct.service.converter;


import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.iesvalleinclan.storeproduct.model.dto.ProductDTO;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductConverter {

    public ProductDTO convertToDTO(ProductVO productVo) {
        return  ProductDTO.builder()
                .id( productVo.getId() )
                .brand(productVo.getBrand())
                .name(productVo.getName())
                .price(productVo.getPrice())
                .reference(productVo.getReference())
                .stock(productVo.getStock())
                .supplier(productVo.getSupplier())
                .active( productVo.isActive() )
                .build();
    }

    public List<ProductDTO> convertVOListToDTOList(List<ProductVO> listVO) {
        return listVO.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public ProductVO convertToVO(ProductDTO productDto) {
        return ProductVO.builder()
                .id(productDto.getId())
                .brand(productDto.getBrand())
                .name(productDto.getName())
                .modifiedDate(new Date())
                .price(productDto.getPrice())
                .reference(productDto.getReference())
                .stock(productDto.getStock())
                .supplier(productDto.getSupplier())
                .active(true)
                .build();
    }

}

