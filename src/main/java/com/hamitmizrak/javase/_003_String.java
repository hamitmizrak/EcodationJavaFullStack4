package com.hamitmizrak.javase;

import java.util.Locale;

/**/
public class _003_String {

    public static void main(String[] args) {
        String kelime = "Malatya İstanbul Malatya";
        System.out.println("Harf Sayısı: " + kelime.length());
        System.out.println("Harf Sayısı Trim: " + kelime.trim().length());
        System.out.println("startsWith " + kelime.startsWith("M"));
        System.out.println("endsWith " + kelime.endsWith(" "));
        System.out.println(kelime.toUpperCase());
        System.out.println(kelime.toLowerCase());

        //charAt()
        System.out.println("ilk harf " + kelime.charAt(0));
        System.out.println("Son harf " + kelime.charAt(15));
        System.out.println("Son harf " + kelime.charAt(kelime.length() - 1));

        //indexOf()
        System.out.println("indexOf " + kelime.indexOf("Malatya"));
        System.out.println("lastIndexOf " + kelime.lastIndexOf("Malatya"));

        //replace
        System.out.println(kelime.replace(kelime, " yeni data"));

        System.out.println(kelime.concat(" Son veri"));
        System.out.println(kelime.contains("İstanbul"));

       //Paraçalamak
        System.out.println(kelime.substring(4));
        System.out.println(kelime.substring(0, 4));


        System.out.println(kelime.isEmpty());
        System.out.println(kelime.equals("Malatya İstanbul MAlatYa"));
        System.out.println(kelime.equalsIgnoreCase("Malatya İstanbul MAlatYa"));



    }
}