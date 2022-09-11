package com.hamitmizrak.oop.inheritancex;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Computer {

    private String computerName;
    private String computerCode;
    private String computerMainCart;
    private String computerRam;

    public void computerMethod(){
        UUID uuid=UUID.randomUUID();
        this.computerCode=uuid.toString();
    }

}
