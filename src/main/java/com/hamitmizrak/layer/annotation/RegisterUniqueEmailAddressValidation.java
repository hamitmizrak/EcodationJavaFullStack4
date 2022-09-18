package com.hamitmizrak.layer.annotation;

import com.hamitmizrak.layer.data.entity.RegisterEntity;
import com.hamitmizrak.layer.data.repository.IRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RegisterUniqueEmailAddressValidation implements ConstraintValidator<AnnotationRegisterUniqueEmailAddress, String> {

    //constructor injection
    IRegisterRepository repository;
    @Autowired
    public RegisterUniqueEmailAddressValidation(IRegisterRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean isValid(String emailAddress, ConstraintValidatorContext context) {
        //findByEmail: bunu Repositor'de ben yazdım (Delivered Query)
        RegisterEntity registerEntity=repository.findByEmail(emailAddress);
        //Eğer database bu veri varsa
        if(registerEntity!=null)
            return false;
        return true;
    }
}
