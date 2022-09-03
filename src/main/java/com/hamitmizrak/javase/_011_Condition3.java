package com.hamitmizrak.javase;
import java.util.Scanner;
public class _011_Condition3 {
    public static void main(String[] args) {

        // Kullanıcıdan alına bir sayıyı negatif mi pozitif mi bulan algortima ?
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = klavye.nextLine();
        char data=kelime.charAt(0);

        if(Character.isLetter(data)) {
            System.out.println("Bu bir hafttir");
        }
        else if(Character.isDigit(data)) {
            System.out.println("Bu bir sayı");
        }else{
            System.out.println("Bu bir özel simgedir");
        }

    }
}