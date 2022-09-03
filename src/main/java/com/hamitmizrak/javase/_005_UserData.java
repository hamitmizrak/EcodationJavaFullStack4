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

     String data=  JOptionPane.showInputDialog("Lütfen birşey yazınız");
     System.out.println(data.toUpperCase()+"\nkelime");
    }
}