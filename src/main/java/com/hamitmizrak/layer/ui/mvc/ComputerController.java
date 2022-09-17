package com.hamitmizrak.layer.ui.mvc;

import com.hamitmizrak.layer.business.dto.ComputerDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
@Log4j2
public class ComputerController {


    //http://localhost:8080/data/computer1
    @GetMapping("/data/computer1")
    public String thy1(Model model){
        model.addAttribute("computer_key1","Merhabalar UZak diyardan geldim");
        return "computer1";
    }

    //http://localhost:8080/data/computer2
    @GetMapping("/data/computer2")
    public String computer1(Model model){
        model.addAttribute("computer_key2","Merhabalar UZak diyardan geldim");
        return "computer2";
    }

    //http://localhost:8080/data/computer3
    @GetMapping("/data/computer3")
    public String computer2(Model model){
        ComputerDto computerDto=ComputerDto.builder().id(1L).computerName("bilgisayar adı").computerPrice(1500).build();
        model.addAttribute("computer_key3",computerDto);
        return "computer3";
    }


    //http://localhost:8080/data/computer4
    @GetMapping("/data/computer4")
    public String computer3(Model model){
        List<ComputerDto> listem=new ArrayList<>();
        for (long i = 1; i <=10 ; i++) {
            ComputerDto computerDto=ComputerDto.builder().id(i).computerName("bilgisayar adı "+i).computerPrice(i*10).build();
            listem.add(computerDto);
        }
        model.addAttribute("computer_key4",listem);
        return "computer4";
    }

    //http://localhost:8080/data/computer5/4
    @GetMapping({"/data/computer5","/data/computer5/{id}"})
    public String computer4(Model model, @PathVariable(name = "id",required = false) Long id){
        if(id==null){
            model.addAttribute("notfound","404 Not Found");
        }else if(id==0){
            model.addAttribute("badrequest","400 Bad Request");
        }else if(id>0){
            ComputerDto computerDto=ComputerDto.builder().id(id).computerName("bilgisayar adı ").computerPrice(100).build();
            model.addAttribute("computer_key5",computerDto);
        }
        return "computer5";
    }
}
