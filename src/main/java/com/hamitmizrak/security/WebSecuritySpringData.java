package com.hamitmizrak.security;

import com.hamitmizrak.layer.bean.PasswordEncoderBean;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecuritySpringData extends WebSecurityConfigurerAdapter {

    //1.YOl Field Injection
    //@Autowired
    //PasswordEncoderBean passwordEncoderBean;

    //2.YOL Constructor Injection
    //PasswordEncoderBean passwordEncoderBean;
    //public WebSecuritySpringData(PasswordEncoderBean passwordEncoderBean) {
    //    this.passwordEncoderBean = passwordEncoderBean;
    //}

  private final PasswordEncoderBean passwordEncoderBean;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/public/homepage","index").permitAll()
                .anyRequest()
                .authenticated()
                .and().formLogin();
                //.httpBasic();
                //.formLogin();
    }

    @Autowired
    private void myUserPassword(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        //maskeleme olmadan sisteme giriş
        //authenticationManagerBuilder.inMemoryAuthentication().withUser("root").password("{noop}root").roles("USER");

        //maskeleme olarak
        authenticationManagerBuilder
                .inMemoryAuthentication()
                .withUser("root")
                .password(passwordEncoderBean.passwordEncoderMethod().encode("root"))
                .roles("USER");
    }
}
