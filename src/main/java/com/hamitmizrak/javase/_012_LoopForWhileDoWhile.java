package com.hamitmizrak.javase;
import java.util.Scanner;

public class _012_LoopForWhileDoWhile {
    public static void main(String[] args) {

        //for
        for (int i = 0; i <10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n************************");
        //while
        int x = 0;
        while(x<10){
            System.out.print(x+" ");
            x=x+1;
        }

        System.out.println("\n************************");
        int y = 0;
        do{
            System.out.print(y+" ");
            y+=1;
        }while(y<10);
    }
}