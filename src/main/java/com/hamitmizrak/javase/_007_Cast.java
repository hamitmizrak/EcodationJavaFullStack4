package com.hamitmizrak.javase;

import java.util.Random;

public class _007_Cast {

    public static void main(String[] args) {

       //Cast: dönüşüm
        //1-)f-L
        float f1=44.55f;
        long l1=151551L;

        byte b2=44;
        int i2=b2;

        String str3="9";
        int i3=Integer.parseInt(str3);
        System.out.println(i3*9);
        int i4=Integer.valueOf(str3);
        System.out.println(i4*9);

        int sayi=44;
        String kelime=String.valueOf(sayi);
        System.out.println(kelime);
        String kelime2=Integer.toString(sayi);
        System.out.println(kelime2);


    }
}