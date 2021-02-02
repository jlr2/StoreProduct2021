package org.iesvalleinclan.storeproduct.repository;


import org.iesvalleinclan.storeproduct.model.ProductVO;

public interface CustomProductRepository {
    ProductVO disable(final String reference);
    ProductVO findProduct(final String reference);
}