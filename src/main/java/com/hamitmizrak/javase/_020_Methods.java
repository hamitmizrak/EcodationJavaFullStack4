package com.hamitmizrak.javase;

public class _020_Methods {

    //voidli Parametresiz
    public void voidliParametresiz(){
        System.out.println("voidli Parametresiz");
    }

    //Overloading
    public void voidliParametresiz(String adi){
        System.out.println("voidli Parametresiz");
    }

    //voidli Parametreli
    public void voidliParametreli(String adi){
        System.out.println("voidli Parametreli "+adi);
    }

    //voidsiz Parametresiz
    public String voidsizParametresiz(){
        return "voidsiz Parametresiz";
    }

    //voidsiz Parametresiz
    public String voidsizParametreli(int sayi){
        return "voidsiz Parametreli "+sayi;
    }

    public static void main(String[] args) {
        _020_Methods methods=new _020_Methods();
        methods.voidliParametresiz();
        methods.voidliParametreli("java");

        String data3=   methods.voidsizParametresiz();
        System.out.println(data3);

        String data4=   methods.voidsizParametreli(44);
        System.out.println(data4);
    }


}