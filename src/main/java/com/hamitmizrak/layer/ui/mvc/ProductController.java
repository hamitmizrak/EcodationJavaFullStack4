package com.hamitmizrak.layer.ui.mvc;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log4j2
public class ProductController {


    // http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
    @ResponseBody
    public String thymeleaf1(){
        return "Merhabalar";
    }

    // http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String thymeleaf2(){
        return "thymeleaf2";
    }

}
