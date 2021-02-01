package org.iesvalleinclan.storeproduct.controller;

import org.iesvalleinclan.storeproduct.model.ProductVO;

import java.util.List;

public interface ProductAPI {

    List <ProductVO > findAll();

    ProductVO  create(ProductVO city);

}
