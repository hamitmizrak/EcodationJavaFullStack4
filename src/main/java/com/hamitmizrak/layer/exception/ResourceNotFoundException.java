package com.hamitmizrak.layer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//404: http
//Bundan sonra 404 hataları yakalayan bir exception mekanizmasını oluşturduk
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    //parametreli constructor
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
