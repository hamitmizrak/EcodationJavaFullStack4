package com.hamitmizrak.layer.ui.rest.impl;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jquery")
@CrossOrigin
public class JqueryApi {

    //http://localhost:8080/api/v1/jquery/cors
    @GetMapping("/cors")
    public String message(){
        return "Merhabalar ben Java Api Backentten geldim";
    }

}
