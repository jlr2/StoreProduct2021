package org.iesvalleinclan.storeproduct.controller.impl;

import org.iesvalleinclan.storeproduct.controller.ProductAPI;
import org.iesvalleinclan.storeproduct.controller.constant.EndPointUris;
import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.iesvalleinclan.storeproduct.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.iesvalleinclan.storeproduct.service.ProductService;

import java.util.List;

@RestController
public class ProductController implements ProductAPI {

    @Autowired
    private ProductService productService;

    @Override
    public ResponseEntity<List<ProductDTO>> findAll() {
        return ResponseEntity.ok(productService.obtainAll());
    }


    @Override
    public ResponseEntity<ProductDTO> create(final ProductDTO productDTO) {
        return ResponseEntity.ok(productService.create(productDTO));
    }


    @Override
    public ResponseEntity<ProductDTO> modify(/*@Valid*/ final ProductDTO productDTO) {
        return ResponseEntity.ok(productService.modify(productDTO));
    }

    @Override
    public ResponseEntity<ProductDTO> disable(final String reference) {
        return ResponseEntity.ok(productService.disable(reference));
    }


    public ResponseEntity<ProductDTO> findProduct(final String reference) {
        return ResponseEntity.ok(productService.findProduct(reference));
    };


    // Pruebas de ResponseEntity
    //Prueba 1:   Construcción de objeto ResponseEntity
  /*  @PutMapping("/saludo")
    public ResponseEntity<String> holaMundo() {
        return new ResponseEntity<>("Hola Mundo -  prueba 1!", HttpStatus.OK);
    }*/

    //Prueba 1-Version con clase de constantes EndPointsUri :   Construcción de objeto ResponseEntity
    @PutMapping(EndPointUris.SALUDO)
    public ResponseEntity<String> holaMundo() {
        return new ResponseEntity<>("Hola Mundo -  prueba 1!", HttpStatus.OK);
    }


    //Prueba 2:  Uso de métodos que incluyen el código de estado.
   /* @PutMapping("/saludo")
    public ResponseEntity<String> holaMundo() {
        return ResponseEntity.ok("Hola Mundo -  prueba 2!");
    }*/

    //Prueba 3: Ruta con variables
    /*@PutMapping("/{nombre}")
    public ResponseEntity<String> holaMundo(@PathVariable String nombre) {
        return ResponseEntity.ok("Hola " + nombre  + "  prueba 3");
    }*/

    // Prueba 4.   Ruta con variables usando la construcción de objeto ResponseEntity
    @PutMapping("/{nombre}")
    public ResponseEntity<String> holaMundo(@PathVariable String nombre) {
        return new ResponseEntity("Hola " + nombre  + "  prueba 4", HttpStatus.OK);
    }

    // Prueba 5.   Paso de más de una variable.  NO FUNCIONA. Da respuesta  HTTP Status 400 – Bad Request
   /* @PutMapping("/{nombre}&{apellidos}")
    public ResponseEntity<String> holaMundo(@PathVariable String nombre, @PathVariable String apellidos) {
        return new ResponseEntity("Hola " + nombre + " " + apellidos + "  prueba 5", HttpStatus.OK);
    }*/



    // Prueba 6.   Paso de más de una variable.
   /* @PutMapping("/{nombre}")
    public ResponseEntity<String> holaMundo(@PathVariable String nombre) {
        String[] nombrearray = nombre.split(",");

        return new ResponseEntity("Hola " + nombrearray[0]  +  " " + nombrearray[1] +  "  prueba 6", HttpStatus.OK);
    }*/


    // Prueba 7.  Cabecera personalizada
    /*@PutMapping("/{cliente}")
    public ResponseEntity<String> cabeceraPersonalizada(@PathVariable String cliente) {
        HttpHeaders cabecera = new HttpHeaders();
        cabecera.add("Estado Cliente", "Cliente " + cliente + ": habilitado");
        return new ResponseEntity<>("Bienvenido " + cliente  + "  Prueba 7", cabecera, HttpStatus.OK);
    }
*/
    // Prueba 8.  Alternativa a prueba 7
   /* @PutMapping("/{cliente}")
    public ResponseEntity<String> cabeceraPersonalizada(@PathVariable String cliente) {
        return ResponseEntity.ok()
                .header("Estado Cliente", "Cliente " + cliente + ": habilitado")
                .body("Bienvenido cliente: " + cliente);
    }*/


    // Prueba 9.  Método status
   /* @PutMapping("/{cliente}")
    public ResponseEntity<String> cabeceraPersonalizada(@PathVariable String cliente) {
        return ResponseEntity.status(200)
                .header("Estado Cliente" + cliente ," habilitado")
                .header ("otra cabecera", "valor de la otra cabecera")
                .body("Bienvenido cliente: " + cliente);
    }*/





}