package org.iesvalleinclan.storeproduct.repository;


import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductVO, Integer>, CustomProductRepository {
}
