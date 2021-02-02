package org.iesvalleinclan.storeproduct.controller;

import org.iesvalleinclan.storeproduct.controller.constant.EndPointUris;
import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.iesvalleinclan.storeproduct.model.dto.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;

@RequestMapping(EndPointUris.PRODUCTS)

public interface ProductAPI {

    @GetMapping
    ResponseEntity<List<ProductDTO>> findAll();

    @PostMapping
    ResponseEntity<ProductDTO> create(/*@Valid*/ @RequestBody final ProductDTO productDTO);

    @PutMapping
    ResponseEntity<ProductDTO> modify(/*@Valid*/ @RequestBody final ProductDTO productDTO);


    @PutMapping(EndPointUris.ID)
    ResponseEntity<ProductDTO> disable(@PathVariable(value = "id") final String reference);

    //Nuevo servicio del microservicio: devolver un producto cuyo referencia coincida con la pasada en la solicitud
    @GetMapping(EndPointUris.REFERENCE)
    ResponseEntity<ProductDTO> findProduct(@PathVariable(value = "reference") final String reference);


}
