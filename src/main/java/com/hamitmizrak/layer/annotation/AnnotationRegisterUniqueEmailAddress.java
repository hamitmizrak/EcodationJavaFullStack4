package com.hamitmizrak.layer.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = {RegisterUniqueEmailAddressValidation.class })
public @interface AnnotationRegisterUniqueEmailAddress {
    String message() default "Aynı email bulunmaktadır farklı bir email giriniz.";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}

