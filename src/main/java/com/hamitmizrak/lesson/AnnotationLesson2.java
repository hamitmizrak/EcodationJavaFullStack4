package com.hamitmizrak.lesson;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AnnotationLesson2 {
    public String personInfo();
}

//Class
@AnnotationLesson2(personInfo="BAYAN")
class Person{
}

//Extend
class Bayan extends Person{
}


//PSVM
class MainClass{
    public static void main(String[] args) {
        Class[] classes = {Person.class, Bayan.class};
        for (Class classObj : classes) {
            Annotation[] annotations = classObj.getAnnotations();
            System.out.println("Annotation : " + annotations.length);
            for (Annotation annotation : annotations) {
                AnnotationLesson2 annoTutorials = (AnnotationLesson2)annotation;
                System.out.println(annoTutorials.personInfo());
            }
        }
    }
}