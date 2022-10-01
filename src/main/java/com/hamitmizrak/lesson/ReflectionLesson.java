package com.hamitmizrak.lesson;

import lombok.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
public class ReflectionLesson {

    public String name;
    public String surname;

    // parametresiz constructor
    public ReflectionLesson() {
        System.out.println("Parametresiz Constructor");
    }

    // parametresiz constructor
    public ReflectionLesson(String name, String surname) {
        System.out.println("Parametreli Constructor");
        this.name = name;
        this.surname = surname;
    }

    public static void main(String[] args) {
        // Reflection nedir?
        // Reflection yapısı sınıf, metot, özellikler ve annotation ait ad, parametre gibi bilgileri almak, denetlemek ve yönetmek için kullanılır.
        // Reflection kullanımı için öncelikle java.lang paketinde yer alan Class, Method, Field, Annotation sınıflarının ve metotlarını bilmek faydalı olacaktır.

        /// String,double, float, char, Object, System kullanabilirsin
        Class<?> intClass=String.class;
        System.out.println("getName: "+intClass.getName());
        System.out.println("getPackageName:  "+intClass.getPackageName());
        System.out.println("getSimpleName: "+intClass.getSimpleName());

        // java.lang.reflect
        Method[] methods = intClass.getMethods();
        System.out.println("Metot sayısı: " + methods.length);
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.getParameterCount());
        }

        // Classs adını döndüren
        System.out.println(ReflectionLesson.class);
        System.out.println(ReflectionLesson.class.getSimpleName());
        System.out.println(ReflectionLesson.class.getName());

        // kullanıcıdan değişkenleri girilmesini sağlamak
        Scanner klavye=new Scanner(System.in);
        List<String> variableList=new ArrayList<>();

        // java.lang.reflect kütüphanesinden geliyor.
        Field[] fields = ReflectionLesson.class.getDeclaredFields();

        // kullanıcıdan tanımlı tüm değişkenelri almak
        for(Field temp:fields){
            System.out.print(temp.getName().toUpperCase()+" deger giriniz: ");
            variableList.add(klavye.next());
        }

        // Ekranda göster
        variableList.stream().forEach((temp)-> System.out.print(temp+" "));
    }
}
