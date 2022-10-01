package com.hamitmizrak.layer.bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Java title")
                                .description("Java Api Data")
                                .version("v1")
                                .contact(new Contact()
                                        .name("Hamit Mızrak")
                                        .url("https://www.hamitmizrak.com.tr")
                                        .email("hamitmizrak@gmail.com"))
                                .termsOfService("INC BY company")
                                .license(new License().name("License 44").url("http://www")));
    }
}
