package com.hamitmizrak.layer.ui.mvc;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SecurityController {

    // http://localhost:8080/public/homepage
    @GetMapping("/public/homepage")
    public String homePage(){
        return "homepage";
    }


    // http://localhost:8080/private/secret/admin
    @GetMapping("/private/secret/admin")
    public String adminPage(){
        return "admin";
    }
}
