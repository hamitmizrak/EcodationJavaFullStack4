package com.hamitmizrak.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTuto {

    public String name;
    public String surname;
    private double price;

    //parametresiz constructor
    public ReflectionTuto() {
        System.out.println("Parametresiz Constructor");
    }

    //parametresiz constructor
    public ReflectionTuto(String name, String surname) {
        System.out.println("Parametreli Constructor");
        this.name = name;
        this.surname = surname;
    }

    //Method
    public String fullName(){
        System.out.println("Full Name method");
        return this.name+" "+this.surname;
    }

    public void priceMethod(double price){
       this.price=price;

    }
}
class ReflectionMain{
    public static void main(String[] args) {
        //java.lang.Class
        //forName() ==> class adını veriri
        try {

          //normal olanlar: sadece public değişkenleri getirir.
         //declare : hem public hemde private getirir.
            //paketAdi.classAdi
            Class reflectionVariable=Class.forName("com.hamitmizrak.util.ReflectionTuto");

            //getContructor==> değişkenleri public olanlar gelir
            //getDeclaredConstructors==> değişkenleri public veya private olanlar gelir

            // Constructor
            //java.lang.reflect Constructor: public olanlar gelir
            Constructor[] constructors=reflectionVariable.getConstructors();
            Constructor[] constructorsDeclared=reflectionVariable.getDeclaredConstructors();

            for(  Constructor temp: constructors){
                System.out.println("Constructor: "+temp.getName());
            }
            for(  Constructor temp: constructorsDeclared){
                System.out.println("Constructor Declared: "+temp.getName());
            }


            //Field
            //java.lang.reflect Field
            Field [] fields=reflectionVariable.getFields();
            Field [] fieldsDeclared=reflectionVariable.getDeclaredFields();

            for(  Field temp: fields){
                System.out.println("Field: "+temp.getName());
            }
            for(  Field temp: fieldsDeclared){
                System.out.println("Field Declared: "+temp.getName());
            }


            //Method
            //java.lang.reflect Constructor
            Method[] methods=reflectionVariable.getMethods();
            Method[] methodsDeclared=reflectionVariable.getDeclaredMethods();
            for(  Method temp: methods){
                System.out.println("Method: "+temp.getName());
            }
            for(  Method temp: methodsDeclared){
                System.out.println("Method Declared: "+temp.getName());
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

