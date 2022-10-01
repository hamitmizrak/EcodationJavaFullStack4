package com.hamitmizrak.oop.inheritancex;

public class InheritanceMainClass {
    public static void main(String[] args) {

    /*    Computer computer=new Computer();
        computer.setComputerName("computer");
        computer.setComputerCode("computer codes Xyı545");
        computer.setComputerMainCart("computer main cart 5156");
        computer.setComputerRam("computer Ram4512511");
        System.out.println(computer);
        computer.computerMethod(); //polymorhism*/

        System.out.println("********************************");

        Msi msi=new Msi();
        msi.setComputerName("Msi");
        msi.setComputerCode("Msi codes Xyı545");
        msi.setComputerMainCart("Msi main cart 5156");
        msi.setComputerRam("Msi Ram4512");
        msi.setSpecialMsi("msi special data");
        System.out.println(msi);
        msi.computerMethod(); //polymorhism

        System.out.println("********************************");

        Asus asus=new Asus();
        asus.setComputerName("Asus");
        asus.setComputerCode("Asus codes ouhbno468516");
        asus.setComputerMainCart("Asus main cart 8115");
        asus.setComputerRam("Asus Ram4512");
        System.out.println(asus);
        asus.computerMethod();//polymorhism
    }
}
