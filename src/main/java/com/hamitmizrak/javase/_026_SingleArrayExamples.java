package com.hamitmizrak.javase;

import java.util.Random;

public class _026_SingleArrayExamples {

    //S1-) 1- 9 arasında 5 tane random sayı üreten dizi metotu
    public static int[] randomArray(){
        Random random=new Random();
       int [] array=new int[5];
        for (int i = 0; i < 5; i++) {
            int number=random.nextInt(9)+1;
            array[i]=number;
        }
        return array;
    }


    //int [] resultArray yernine üç nokta
    //S2-) Bu sayıların toplamı ve tek-çift sayı adedi ?
    public static void arraySumOddEven(int... resultArray){
        for(int temp: resultArray){
            System.out.print(temp+" ");
        }

        int oddCounter=0,evenCounter=0,sum=0;
        for(int temp: resultArray){
            sum=sum+temp;
            //sum+=temp;
            if(temp%2==0){
                evenCounter++;
            }else{
                oddCounter++;
            }
        }
        System.out.println("\nToplamları: "+sum);
        System.out.println("Çift sayı adedi: "+evenCounter);
        System.out.println("Tek sayı adedi: "+oddCounter);
    }


    public static void main(String[] args) {
        arraySumOddEven(randomArray());
    }
}
