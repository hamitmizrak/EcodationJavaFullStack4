package com.hamitmizrak.layer.ui.mvc;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Log4j2
public class SecurityController {


    // http://localhost:8080/public/homepage
    @GetMapping("/index")
    public String indexPage(){
        return "index";
    }

    // http://localhost:8080/public/homepage
    @GetMapping("/public/homepage")
    public String homePage(){
        return "homepage";
    }

    // http://localhost:8080/admin
    @GetMapping("/admin")
    public String adminPage(Model model){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        String user="";
        if(authentication!=null){
            user=authentication.getName();
        }
        model.addAttribute("user_key",user);
        return "admin";
    }


    // login?error
    // http://localhost:8080/login
    @GetMapping("/login")
    public String login(@RequestParam(value="error",required = false)String error,Model model){
        if(error!=null){
           model.addAttribute("login_key","Kullanıcı Adı veya Şifreniz yanlış");
        }else{
            model.addAttribute("login_key","Lütfen Bilgilerinizi Giriniz");
        }
        return "login";
    }


    // http://localhost:8080/logout
    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response,Model model){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        if(authentication!=null){
            new SecurityContextLogoutHandler().logout(request,response,authentication);
        }else{
            model.addAttribute("logout_key","Sistemde Kullanıcı yok");
        }
        return "logout";
    }


}
