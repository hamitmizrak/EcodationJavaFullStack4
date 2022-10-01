package com.hamitmizrak.lesson;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionAnnotation {
    //Wilcard
    // Tek bir veri  exception türü verebilirsin
   // Class<? extends Throwable> data();

    // Tistediğin veri  exception türü verebilirsin
    Class<? extends Throwable>[] data();
}

class DenemeMain{

    @ExceptionAnnotation(data = ArithmeticException.class)
    public static void exam1(){
        int sayi=4/0;
        System.out.println(sayi);
    }

    public static void main(String[] args) {
        exam1();
    }

}
