package com.hamitmizrak.layer.ui.mvc;

import com.hamitmizrak.layer.bean.ModelMapperBean;
import com.hamitmizrak.layer.business.dto.RegisterDto;
import com.hamitmizrak.layer.data.entity.RegisterEntity;
import com.hamitmizrak.layer.data.repository.IRegisterRepository;
import com.hamitmizrak.layer.exception.ResourceNotFoundException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@Controller
@Log4j2
@Transactional
public class RegisterController {

    //Field injection

    //Constructor injection
    IRegisterRepository repository;
    ModelMapperBean modelMapperBean;
    @Autowired
    public RegisterController(IRegisterRepository repository, ModelMapperBean modelMapperBean) {
        this.repository = repository;
        this.modelMapperBean = modelMapperBean;
    }

    //dosya yazmak Path
    private static final String PATH = "C:\\0_Tutorials\\fileio\\ecodation.txt";

    //Simdiki zaman metodu
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
        RegisterEntity registerEntity=modelMapperBean.modelMapperMethod().map(registerDto,RegisterEntity.class);
        try {
            if(registerEntity!=null){
                repository.save(registerEntity);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }

    // ################################# CRUD #######################################################

    //CREATE READY
    // http://localhost:8080/create/register
    @GetMapping("create/register")
    public String createDataSet(Model model){
        int counter=1;
        for (int i = 11; i <= 15; i++) {
            UUID randomHex=UUID.randomUUID();
            RegisterEntity entity = RegisterEntity.builder()
                    .name("adi " + i)
                    .surname("soyadi " + i)
                    .email(randomHex.toString())
                    .password("password" + i)
                    .build();
            repository.save(entity);
            counter++;
        }
        model.addAttribute("key_dataset",counter+" tane Register oluştuldu");
        return "registerList";
    }

    //LIST
    //http://localhost:8080/register/list
    @GetMapping("register/list")
    public String registerFindById(Model model){
       Iterable<RegisterEntity>  list= repository.findAll();
       model.addAttribute("register_list",list);
       list.forEach((temp)->{
           System.out.println(temp);
       });
        return "registerList";
    }

    //FIND
    //http://localhost:8080/register/find
    //http://localhost:8080/register/find/1
    @GetMapping({"register/find","register/find/{id}"})
    public String registerFindById(@PathVariable(name="id",required = false) Long id,Model model){
        RegisterEntity registerEntity=repository.findById(id).orElseThrow(()-> new ResourceNotFoundException(id+" register id bulunamadı"));


        return "registerList";
    }

}
