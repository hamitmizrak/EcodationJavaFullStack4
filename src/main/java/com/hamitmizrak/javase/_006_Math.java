package com.hamitmizrak.javase;

import java.util.Random;

public class _006_Math {

    public static void main(String[] args) {

        //Math
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println("Karekök: "+Math.sqrt(16));
        System.out.println("Üslü: "+Math.pow(2,5));
        System.out.println("Mutlak: "+Math.abs(-4));
        System.out.println("Min: "+Math.min(2,-900));
        System.out.println("Max: "+Math.max(2,-900));
        System.out.println("Yukarı yuvarlama: "+Math.ceil(2.1));
        System.out.println("Aşağı yuvarlama: "+Math.floor(2.9));
        System.out.println("Round yuvarlama: "+Math.round(2.4));
        System.out.println("Random yuvarlama: "+Math.random()*4+1);
        System.out.println("Random yuvarlama: "+Math.round(Math.random()*4+1));

        Random rastgele=new Random();
        int sayi= rastgele.nextInt(4)+1;
        System.out.println(sayi);

    }
}