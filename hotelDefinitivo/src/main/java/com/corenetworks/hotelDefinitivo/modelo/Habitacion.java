package com.corenetworks.hotelDefinitivo.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "habitaciones")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHabitacion;
    @Column(nullable = false)
    private double tarifa;
    @Column(length = 60)
    private String descripcion;
    @Column(length = 30)
    private String tipoAnimal;
}
