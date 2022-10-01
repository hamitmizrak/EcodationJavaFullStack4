package com.hamitmizrak.oop.abstracx;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
abstract public class Computer {

    private String computerName;
    private String computerCode;
    private String computerMainCart;
    private String computerRam;


    //Gövdeli metot
    public void computerMethod() {
        UUID uuid = UUID.randomUUID();
        this.computerCode = uuid.toString();
    }

    //Gövdesiz Metot
 abstract public void govdesizMethod();

}
