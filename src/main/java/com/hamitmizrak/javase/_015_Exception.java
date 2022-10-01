package com.hamitmizrak.javase;

import org.webjars.NotFoundException;

import java.io.IOException;

public class _015_Exception {
    public static void main(String[] args) throws  ArithmeticException, NotFoundException , IOException {

        //java.lang > object > throwable > 1-) exception  2-)error
        try{
            int birinciSayi=4,ikinciSayi=0,sonuc;

            if(ikinciSayi==0) {
                //throw new ArithmeticException(" Sıfıra bölme istisnası meydana getirir");
                throw new HamitMizrakException(" Sıfıra bölme istisnası meydana getirir");
            }else{
                sonuc=birinciSayi/ikinciSayi;
                System.out.println(sonuc);
            }

        }catch(ArithmeticException e){
         e.printStackTrace();
        } catch (HamitMizrakException e) {
            e.printStackTrace();
        } finally {
            System.out.println("database.close");
        }
        System.out.println("son kelime");
    }
}