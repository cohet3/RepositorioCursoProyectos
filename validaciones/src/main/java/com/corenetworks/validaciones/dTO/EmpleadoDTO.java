package com.corenetworks.validaciones.dTO;

import com.corenetworks.validaciones.modelo.Empleado;
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
    public Empleado castEmpleado(){
        Empleado e1= new Empleado();
        e1.setIdEmpledo(idEmpledo);
        e1.setNombreEmpleado(nombreEmpleado);
        //unas con this otras sin this para ver ambas formas de declararlo
        e1.setDni(this.getDni());
        e1.setSueldo(this.getSueldo());
        return e1;
    }
    public EmpleadoDTO castEmpleadoADto(Empleado e){
        idEmpledo = e.getIdEmpledo();
        dni= e.getDni();
        nombreEmpleado = e.getNombreEmpleado();
        sueldo = e.getSueldo();
        return this;
    }
}
