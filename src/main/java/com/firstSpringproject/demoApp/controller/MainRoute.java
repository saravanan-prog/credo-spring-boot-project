package com.firstSpringproject.demoApp.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


/**
 *
 *    http methods : GET POST PUT PATCH DELETE
 *    http://localhost:8080/
 *
 */


@RestController
public class MainRoute {

    @GetMapping
    public String getMethodCalled(){
        return "GET - method is reached successFully";
    }

    @PostMapping
    public String postMethodisInvoked(){
        return "Post Method is Calling....";
    }

    @PutMapping
    public String putMethodisInvoked(){
        return "Put Method is Calling....";
    }

    @PatchMapping
    public String patchMethodisInvoked(){
        return "Patch Method is Calling....";
    }

    @DeleteMapping
    public String DeleteMethodisInvoked(){
        return "Delete Method is Calling....";
    }


}
