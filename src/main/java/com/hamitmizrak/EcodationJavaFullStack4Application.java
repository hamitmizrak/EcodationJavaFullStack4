package com.hamitmizrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/*@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class
        //org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        //org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)*/
@SpringBootApplication
public class EcodationJavaFullStack4Application  {

    //PSVM
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled","true");
        System.setProperty("java.awt.headless", "false"); //Disables headless
        SpringApplication.run(EcodationJavaFullStack4Application.class, args);
    }
}
