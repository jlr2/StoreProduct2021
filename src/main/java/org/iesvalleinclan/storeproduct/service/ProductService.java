package org.iesvalleinclan.storeproduct.service;

import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.iesvalleinclan.storeproduct.model.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> obtainAll();

    ProductDTO create(final ProductDTO product);

    ProductDTO modify(final ProductDTO product);

    ProductDTO disable(final String reference);

    ProductDTO findProduct(final String reference);
}