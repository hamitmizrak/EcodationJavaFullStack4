package com.hamitmizrak.javase;

import java.util.Scanner;

public class _023_WeekDayEnum {

    //class varaible
    private static Scanner klavye = new Scanner(System.in);

    // Kullanıcı tarafından girilen hafta günü gösteren algoritma
    private static String getUserData() {
        System.out.println("\nLütfen  haftanın gününü giriniz ");
        String day = klavye.nextLine();
        return day;
    }

    private static void whoWeekDay() {
        //_022_Enum.PAZARTESI.toString():
        String day1="PAZARTESI";
        String day = getUserData().toUpperCase();
        switch (day) {

            case "PAZARTESI":
                System.out.println("Günlerden PAZARTESI");
                break;
            case "SALI":
                System.out.println("Günlerden SALI");
                break;
            case "CARSAMBA":
                System.out.println("Günlerden CARSAMBA");
                break;
            case "PERSEMBE":
                System.out.println("Günlerden PERSEMBE");
                break;
            case "CUMA":
                System.out.println("Günlerden CUMA");
                break;
            case "CUMARTESI":
                System.out.println("Günlerden CUMARTESI");
                break;
            case "PAZAR":
                System.out.println("Günlerden PAZAR");
                break;

            default:
                System.out.println("Haftanın gününü giriniz");
                break;
        }


    }

    //PSVM
    public static void main(String[] args) {
     /*   for(;;) {
            whoWeekDay();
        }*/
        System.out.println(_022_Enum.CUMARTESI.toString());
        System.out.println(_022_Enum.CUMARTESI.ordinal());
        System.out.println(_022_Enum.CUMARTESI.values()[0]);

    }
}
