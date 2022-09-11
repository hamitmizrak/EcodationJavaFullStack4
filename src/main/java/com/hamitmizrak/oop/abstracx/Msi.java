package com.hamitmizrak.oop.abstracx;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Msi extends Computer {

    private String specialMsi;

    public Msi() {
    }

    public Msi(String computerName, String computerCode, String computerMainCart, String computerRam, String specialMsi) {
        super(computerName, computerCode, computerMainCart, computerRam);
        this.specialMsi = specialMsi;
    }

    @Override
    public void computerMethod() {
        System.out.println("Msi Method");
    }

    @Override
    public void govdesizMethod() {
        System.out.println("Msi Gövdesiz Method");
    }
}
