package org.iesvalleinclan.storeproduct.repository.impl;


import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.iesvalleinclan.storeproduct.repository.CustomProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class CustomProductRepositoryImpl implements CustomProductRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public ProductVO disable(final String reference){
        Query query = new Query();
        query.addCriteria(Criteria.where("reference").is(reference));

        Update update = new Update();
        update.set("active", false);

        return mongoTemplate.findAndModify(
                query, update,
                new FindAndModifyOptions().returnNew(true), ProductVO.class);
    }

    public ProductVO findProduct(final String reference){
        Query query = new Query();
        query.addCriteria(Criteria.where("reference").is(reference));


        return mongoTemplate.findOne(query, ProductVO.class);
    }


}

