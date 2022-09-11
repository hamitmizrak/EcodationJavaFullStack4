package com.hamitmizrak.oop.abstracx;

public class InheritanceMainClass {
    public static void main(String[] args) {

        //polymorphism
        Computer computer= new Msi();
        computer.setComputerName("computer");
        computer.setComputerCode("computer codes Xyı545");
        computer.setComputerMainCart("computer main cart 5156");
        computer.setComputerRam("computer Ram4512511");
        System.out.println(computer);
        computer.computerMethod(); //polymorhism

        System.out.println("********************************");

        Msi msi2=new Msi();
        msi2.setComputerName("Msi");
        msi2.setComputerCode("Msi codes Xyı545");
        msi2.setComputerMainCart("Msi main cart 5156");
        msi2.setComputerRam("Msi Ram4512");
        msi2.setSpecialMsi("msi special data");
        System.out.println(msi2);
        msi2.setSpecialMsi("asd");
        msi2.govdesizMethod();//polymorhism
        msi2.computerMethod(); //polymorhism

        System.out.println("********************************");

        Asus asus=new Asus();
        asus.setComputerName("Asus");
        asus.setComputerCode("Asus codes ouhbno468516");
        asus.setComputerMainCart("Asus main cart 8115");
        asus.setComputerRam("Asus Ram4512");
        System.out.println(asus);
        asus.computerMethod();//polymorhism
        asus.govdesizMethod();
    }
}
