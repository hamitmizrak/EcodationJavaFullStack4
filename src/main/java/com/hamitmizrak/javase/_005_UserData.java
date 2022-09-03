package com.hamitmizrak.javase;

import javax.swing.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**/
public class _005_UserData {

    public static void main(String[] args) {
      //  Scanner klavye=new Scanner(System.in);
      //  System.out.println("Lütfen bir şeyler yazınız");
        ////String kelime=klavye.nextLine();
       // int kelime=klavye.nextInt();
       // System.out.println(kelime*kelime);

        //Yes: 0
        //No:1
        //Cancel:2
        int chooise=  JOptionPane.showConfirmDialog(null,"Tatile gitmek istiyor musunuz ?");
        System.out.println(chooise);
        if(chooise==0)
            System.out.println("Gidiyoruz");
        else if(chooise==1)
            System.out.println("Evdeyiz");
        else
            System.out.println("Cevaplamadan Çıkıldı.");

     //String data=  JOptionPane.showInputDialog("Lütfen birşey yazınız");
    // System.out.println(data.toUpperCase()+"\nkelime");


    }
}