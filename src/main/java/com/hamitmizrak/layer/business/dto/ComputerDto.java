package com.hamitmizrak.layer.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComputerDto {

    private Long id;
    private String computerName;
    private double computerPrice;
}
