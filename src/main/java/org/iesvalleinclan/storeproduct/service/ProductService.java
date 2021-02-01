package org.iesvalleinclan.storeproduct.service;

import org.iesvalleinclan.storeproduct.model.ProductVO;
import java.util.List;

public interface ProductService {

    List< ProductVO > findAll();
    ProductVO create( ProductVO product);

}