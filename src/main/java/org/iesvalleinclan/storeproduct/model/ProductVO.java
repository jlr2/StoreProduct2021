package org.iesvalleinclan.storeproduct.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.validation.constraints.DecimalMin;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document

public class ProductVO {
    @Id
    String id;
    int stock;
    String name;
    String brand;
    Date modifiedDate;
  //  @DecimalMin("0.0")
    double price;
    @Indexed(unique = true)
    String reference;
    String supplier;
    boolean active=true;
}