package com.hamitmizrak.layer.ui.rest.impl;

import com.hamitmizrak.layer.business.dto.AdminDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/v1")
@CrossOrigin
@Log4j2
public class AdminApi {

    //http://localhost:8080/api/admin/v1/tutorialsapi1
    @GetMapping("tutorialsapi1")
    public String getApi1(){
        return "Merhabalar Ben Api";
    }

    //http://localhost:8080/api/admin/v1/tutorialsapi2
    @GetMapping("tutorialsapi2")
    public AdminDto getApi2(){
        AdminDto adminDto=AdminDto.builder().id(1L).name("adı").surname("soyadı").build();
        return adminDto;
    }
}
