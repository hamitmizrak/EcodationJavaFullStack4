package com.hamitmizrak.javase;



public class _009_Condition {

    public static void main(String[] args) {

        int sayi=5;
        if(sayi==5){
            System.out.println("Sayı 5");
        }else{
            System.out.println("Sayı 5 farklı");
        }

        String result=(sayi==5) ?"Sayı 5" :"Sayı 5 farklı" ;
        System.out.println(result);

    }
}