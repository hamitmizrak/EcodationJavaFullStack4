package com.hamitmizrak.javase;

public class _024_SingleArray {

    public static void main(String[] args) {
//        int[] dizi=new int[10];
//        dizi[0]=1;
//        dizi[7]=7;
//        dizi[9]=9;

        int[] dizi= {1,3,5,4};

        //iterative for
        for (int i = 0; i <dizi.length ; i++) {
            System.out.print(dizi[i]+" ");
        }
        System.out.println("\n************");
        //Ismi for each döngüsü
        for ( var temp  : dizi ){
            System.out.print(temp+" ");
        }
    }
}
