package org.iesvalleinclan.storeproduct.controller;

import org.iesvalleinclan.storeproduct.controller.constant.EndPointUris;
import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping(EndPointUris.PRODUCTS)
public interface ProductAPI {

    List <ProductVO > findAll();

    ProductVO  create(ProductVO city);

}
