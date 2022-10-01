package com.hamitmizrak.layer.ui.rest.impl;

import com.hamitmizrak.layer.business.dto.AdminDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    //http://localhost:8080/api/admin/v1/tutorialsapi3/44
    @GetMapping("tutorialsapi3/{id}")
    public AdminDto getApi3(@PathVariable(name = "id") Long adminId){
        AdminDto adminDto=AdminDto.builder().id(adminId).name("adı").surname("soyadı").build();
        return adminDto;
    }


    //http://localhost:8080/api/admin/v1/tutorialsapi4?id=44
    @GetMapping("tutorialsapi4")
    public AdminDto getApi4(@RequestParam(name = "id") Long adminId){
        AdminDto adminDto=AdminDto.builder().id(adminId).name("adı").surname("soyadı").build();
        return adminDto;
    }


    //http://localhost:8080/api/admin/v1/tutorialsapi5
    @GetMapping("tutorialsapi5")
    public List<AdminDto> getApi4(){
        List<AdminDto> list=new ArrayList<>();
        for (int i = 1; i <=5 ; i++) {
            list.add(AdminDto.builder().id(Long.valueOf(i)).name("adı"+i).surname("soyadı"+i).build());
        }
        return list;
    }
    /*
    *
    * {
    "timestamp": "2022-10-01T13:09:50.246+00:00",
    "status": 404,
    "error": "Not Found",
    "message": "No message available",
    "path": "/api/admin/v1/tutorialsapi6"
    }
    * */


    //http://localhost:8080/api/admin/v1/tutorialsapi6
    //http://localhost:8080/api/admin/v1/tutorialsapi6/44
    @GetMapping({"tutorialsapi6","tutorialsapi6/{id}"})
    public AdminDto getApi6(@PathVariable(name = "id",required = false) Long adminId){
        AdminDto adminDto=null;
        if(adminId==null){
            log.error("Null değer verdiniz");
            adminDto=AdminDto.builder().id(1L).name("adı").surname("soyadı").build();
        }else if(adminId==0){
            log.error("Sıfır değer verdiniz");
            adminDto=AdminDto.builder().id(adminId).name("adı").surname("soyadı").build();
        }
        else if(adminId>0){
            adminDto=AdminDto.builder().id(adminId).name("adı").surname("soyadı").build();
        }
        return adminDto;
    }


    //http://localhost:8080/api/admin/v1/tutorialsapi7
    @GetMapping("tutorialsapi7")
    public ResponseEntity<AdminDto>  getApi7(){
        AdminDto adminDto=AdminDto.builder().id(1L).name("adı").surname("soyadı").build();
        return ResponseEntity.ok(adminDto);
    }

    //http://localhost:8080/api/admin/v1/tutorialsapi8
    //http://localhost:8080/api/admin/v1/tutorialsapi8/44
    @GetMapping({"tutorialsapi8","tutorialsapi8/{id}"})
    public ResponseEntity<AdminDto>  getApi8(@PathVariable(name = "id",required = false) Long adminId){
        AdminDto adminDto=AdminDto.builder().id(1L).name("adı").surname("soyadı").build();
        if(adminId==null){
            return ResponseEntity.notFound().build();
        }else if(adminId==0){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(adminDto);
    }

}
