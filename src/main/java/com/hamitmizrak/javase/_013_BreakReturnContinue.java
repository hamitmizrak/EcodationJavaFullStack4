package com.hamitmizrak.javase;

import java.util.Scanner;

public class _013_BreakReturnContinue {
    public static void main(String[] args) {

        //break: döngünün çalışmasını engeller
        //return : metotdun çalışmasını engeller
        //continue:sadece 1 kere o döngüde çalışmaz sonra devam eder.

        //Kullanıcıdan bitiş sayısını alalım
        // 1- ? arasındaki sayıları toplayalım ?
        // eğer sayılardan 6 varsa bunu toplamasın
        // eğer  kullanıcıdan verilen bitiş sayı 10 büyükse hesaplamasın.
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bitiş sayısını giriniz");
        int finishNumber= klavye.nextInt();
        int sum=0;
        for (int i = 1; i <=finishNumber ; i++) {
            if(i==6)
                continue;
            if(i>10)
                break;
            sum+=i;
        }
        System.out.println(sum);
    }
    //Ödev: kullanıcıdan alınan günleri gösteren algoritma (switch-case)
    //Ödev: Vize Final sorusu
    //Kullanıcıdan alına vize:%40
    //Kullanıcıdan alına vize:%60
    //result: ortalama 50 geçti 80:BA 81-100:AA
}