package com.hamitmizrak.layer.ui.mvc;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@Log4j2
public class ProductApiController {

    //http://localhost:8080/client/product
    @GetMapping("client/product")
    //@ResponseBody
    public String getclient1(Model model){
       final String URL="http://localhost:8080/api/product/v1/product1";
        RestTemplate restTemplate=new RestTemplate();
        String clientData=restTemplate.getForObject(URL,String.class);
        log.info(clientData);
        model.addAttribute("api_client",clientData);
        return "api";
    }

}
