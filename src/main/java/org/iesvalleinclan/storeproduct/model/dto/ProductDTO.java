package org.iesvalleinclan.storeproduct.model.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude( JsonInclude.Include.NON_NULL)

public class ProductDTO {
    String id;
    // Se comentan las anotaciones de las restricciones porque no encuentra la dependencia.
    //@Min(0)  
    int stock;
    //@NotBlank(message = "Name cannot be empty")
    String name;
    //@NotBlank(message = "Brand cannot be empty")
    String brand;
    double price;
    //@NotBlank(message = "Reference cannot be empty")
    String reference;
    //@NotBlank(message = "Supplier cannot be empty")
    String supplier;
    boolean active;
}

