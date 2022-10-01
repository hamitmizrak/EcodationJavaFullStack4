package com.hamitmizrak.javase;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class _014_Tarih {
    public static void main(String[] args) {


        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        LocalTime localDate2=LocalTime.now();
        System.out.println(localDate2);

        LocalDateTime localDate3=LocalDateTime.now();
        System.out.println(localDate3);


        System.out.println("*******************************");
        //1900 ekle çıkar
        //DATE
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss",locale);

        Date date=new Date();
        System.out.println(date);

        String formatData= simpleDateFormat.format(date);
        System.out.println(formatData);

        date.setMonth(1);
        System.out.println(date.getMonth());
        System.out.println(new Date(System.currentTimeMillis()));
        long current=System.currentTimeMillis();
        System.out.println(current);
        ////////////////////////////////

        System.out.println("*******************************");
        //CALENDAR
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());

    }
}