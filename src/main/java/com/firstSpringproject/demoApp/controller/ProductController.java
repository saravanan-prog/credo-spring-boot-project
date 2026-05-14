package com.firstSpringproject.demoApp.controller;


import com.firstSpringproject.demoApp.model.Products;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public String getAllProduct(){
        return "All product you will get soon...";
    }

    @PostMapping
    public Products addProduct(@RequestBody Products payload){

        return payload;
    }

    @PutMapping()
    public String updateProduct(){

        return "Put-mapping is calling";
    }
}
