package com.hamitmizrak.layer.ui.rest.impl;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product/v1")
@CrossOrigin
@Log4j2
public class ProductApi {

    //http://localhost:8080/api/product/v1/product1
    @GetMapping("product1")
    public String getApi1(){
        return "Merhabalar @RestController Api";
    }
}
