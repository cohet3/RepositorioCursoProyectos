package com.corenetworks.validaciones.dTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumenDto {
    private int contador;
    private double sueldoPromedio;
}
