package com.firstSpringproject.demoApp.controller;

import org.springframework.web.bind.annotation.*;


/**
 *
 *    http methods : GET POST PUT PATCH DELETE
 *   /products/25/laptop
 *
 */

@RestController
@RequestMapping("/products")
public class Prodcuts {

    @GetMapping
    public String getProducts(){
        return "Your product will get soon";
    }

    @GetMapping("/{id}")
    public long getSingleProdut(@PathVariable long id){
        return id;
    }

    @GetMapping("/{id}/{name}")
    public String getProductSearch( @PathVariable int id, @PathVariable String name ){

        return name;
    }


    @PostMapping
    public String addProducts(){
        return "product added successfully";
    }

    @PutMapping
    public String updateProduct(){
        return "product updated successfully";
    }

    @PatchMapping
    public String patchProductUpdate(){
        return "product patched successfully";
    }

    @DeleteMapping
    public String removeProduct(){
        return "You product is removed successFully";
    }



}
