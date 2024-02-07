package com.corenetworks.examen4DannyR.ejercicio1.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

/*@Table(name="productos")*/
public class Producto {
    private String nombre;
    private double precio;
}
