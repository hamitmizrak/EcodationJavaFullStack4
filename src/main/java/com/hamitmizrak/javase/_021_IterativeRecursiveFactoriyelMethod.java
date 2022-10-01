package com.hamitmizrak.javase;
import java.util.Scanner;
public class _021_IterativeRecursiveFactoriyelMethod {

    //class varaible
   private static Scanner klavye=new Scanner(System.in);

    public static int userData() throws HamitMizrakException {
        System.out.println("\nLütfen bir sayı giriniz ");
        int number=klavye.nextInt();
        if(number<0){
            System.out.println("Sıfırdan küçük giremezsiniz");
            number= Math.abs(number);
        }else if(number ==0 || number==1 ){
            return 1;
        } else if(number>20){
            throw new HamitMizrakException("Büyük sayılar vermeyelim");
        }
        return number;
    }

    //iterative Factoriyel
    public static void iterativeFactoriyel() throws HamitMizrakException {
        int number=userData();
        int result=1;
        for(int i=number; i>0; i--){
            result=result*i;
        }
        System.out.println(number+" Sayısının faktöriyeli "+result);
    }

    //Recursive Factoriyel
    public static int recursiveFactoriyel(int number) throws HamitMizrakException {
        if(number<=0 || number ==1 ){
            return 1;
        }
        return number*recursiveFactoriyel(number-1);
    }

    //Kullanıcıda tarafından verilen bir sayının faktöriyeli hesaplayan algoritma ?
    // 4!= 4 * 3 * 2 * 1
    public static void main(String[] args) throws HamitMizrakException {
        while(true){
            //iterativeFactoriyel();
            int number=userData(),result;
            result=   recursiveFactoriyel(number);
            System.out.println(result);
        }
    }
}