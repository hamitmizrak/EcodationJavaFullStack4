package com.hamitmizrak.lesson;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//RetentionPolicy.SOURCE: derleyici zamanında gerçekleşilir.

//RetentionPolicy.CLASS: derleyici tarafından oluşturulan sınıf dosyalarına kaydedilir
//JVM tarafından kaydedilmesi gerekmez

//RetentionPolicy.RUNTIME: çalışma zamanında korunması gerektiğini belirtilir.
//Çalışma zamanında JVM zaamnında saklanır
@Retention(RetentionPolicy.RUNTIME)

//sadece metotlar üzerinde çalışılacağını belirtilir.
@Target(ElementType.METHOD)
public @interface  AnnotationLesson{
}

class mainClass{

    @AnnotationLesson
    public static void deneme() {

    }
}