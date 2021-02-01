package org.iesvalleinclan.storeproduct.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document


public class ProductVO {
    @Id
    String id;
    String name;
    String reference;
    int stock;
    double price;
    String supplier;
    String brand;
    boolean active=true;
    Date modifiedDate;
}