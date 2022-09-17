package com.hamitmizrak.layer.ui.mvc;

import com.hamitmizrak.layer.business.dto.RegisterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
@Log4j2
public class RegisterController {

    //dosya yazmak
    private static final String PATH = "C:\\0_Tutorials\\fileio\\ecodation.txt";

    private String nowDate() {
        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
        return simpleDateFormat.format(new Date());
    }

    //FILE WRITER
    private void writerDataFile(RegisterDto registerDto) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) {
            bufferedWriter.write("[" + nowDate() + "] " + registerDto);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //FORM VALIDATION
    //GET
    //http://localhost:8080/validation/register
    @GetMapping("/validation/register")
    public String validationGetRegister(Model model) {
        model.addAttribute("key_register_validation", new RegisterDto());
        return "register";
    }

    //FORM VALIDATION
    //POST
    //http://localhost:8080/validation/register
    @PostMapping("/validation/register")
    //Dikkat: RegisterDto ile BindingResult arasına birşey girmemesi gerekiyor
    public String validationPostRegister(@Valid @ModelAttribute("key_register_validation") RegisterDto registerDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            log.error("HATA: " + bindingResult.hasErrors());
            return "register";
        }

        //Eğer valdiaiton bir sıkıntı yoksa
        model.addAttribute("register_success", "Üye Kaydı Başarılı" + registerDto);
        log.info("BAŞARILI: " + registerDto);
        //File Writer
        writerDataFile(registerDto);
        //database
        return "success";
    }

}
