package com.hamitmizrak.javase;


import java.util.Scanner;

public class _010_Condition2 {

    public static void main(String[] args) {

        int sayi=5;
        if(sayi==1){
            System.out.println("Sayı 1");
        }else if(sayi==2){
            System.out.println("Sayı 2");
        }else if(sayi==3){
            System.out.println("Sayı 2");
        }else if(sayi==4){
            System.out.println("Sayı 4");
        }else if(sayi==5){
            System.out.println("Sayı 5");
        }else{
            System.out.println("Sayı 5 farklı");
        }

        switch (sayi){
            case 1:
                System.out.println("Sayı 1");
                break;
            case 2:
                System.out.println("Sayı 2");
                break;
            case 3:
                System.out.println("Sayı 3");
                break;
            case 4:
                System.out.println("Sayı 4");
                break;
            case 5:
                System.out.println("Sayı 5");
                break;
            default:
                System.out.println("Sayı 5 farklı");
                break;
        }

        // Kullanıcıdan alına bir sayıyı negatif mi pozitif mi bulan algortima ?
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number=klavye.nextInt();
        if(number<0)
            System.out.println("Sayı negatif");
        else
            System.out.println("Sayı pozitif");

        //ÖDEV
        //Kullanıcıdan alınan iki tane String karşılaştıralım ?
        //password-repassword
        // Doğru girdiniz
        // tekrar giriniz.


        System.out.println("Lütfen bir kelime giriniz");



    }
}