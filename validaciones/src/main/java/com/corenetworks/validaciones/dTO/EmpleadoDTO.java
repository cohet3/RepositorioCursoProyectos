package com.corenetworks.validaciones.dTO;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class EmpleadoDTO {
    private int idEmpledo;
    @NotEmpty
    @Size(min=3,max=60)//solo para Strings
    private String nombreEmpleado;
    @NotNull
    private String dni;
    @Min(400)
    @Max(32000)
    private double sueldo;
}
