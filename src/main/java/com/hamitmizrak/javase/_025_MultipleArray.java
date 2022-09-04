package com.hamitmizrak.javase;

public class _025_MultipleArray {

    public static void main(String[] args) {
        int[][] dizi=new int[3][3];
        dizi[0][0]=0;
        dizi[0][1]=1;
        dizi[0][2]=2;
        dizi[1][0]=3;
        dizi[1][1]=4;
        dizi[1][2]=5;
        dizi[2][0]=6;
        dizi[2][1]=7;
        dizi[2][2]=8;


        //iterative for
        for (int i = 0; i <dizi.length ; i++) {//satır
            for (int j = 0; j <dizi[i].length ; j++) {//sutun
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }

    }
}
