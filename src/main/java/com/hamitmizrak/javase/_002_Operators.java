package com.hamitmizrak.javase;

/**/
public class _002_Operators {

public static void main(String[] args) {
  //operators
    int sayi1=20;
    int sayi2=10;

    int sayi3=sayi1+sayi2;
    System.out.println("Toplam: "+sayi3);

    int sayi4=sayi1-sayi2;
    System.out.println("Çıkarma: "+sayi4);


    int sayi5=sayi1*sayi2;
    System.out.println("Çarpım: "+sayi5);


    int sayi6=sayi1/sayi2;
    System.out.println("Bölüm: "+sayi6);

    int sayi7=sayi1%sayi2;
    System.out.println("Bölümünden kalan: "+sayi7);

    // Dereceyi fahrenhayt2a çeviren jaba programı
    int derece=20;
    // Fahrenhayt: (derece*9/5)+32
    double fahrenhayt=derece*9/5+32;
    System.out.println(fahrenhayt);

}
}