package com.corenetworks.examen4DannyR.Ejercicio2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "animales")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimal;
    private LocalDate fechaNacimiento;
    @Column(length = 6,nullable = false)
    private String  sexo;
    private int idPais;

    @ManyToOne
    @JoinColumn(name= "idEspecie", nullable = false, foreignKey = @ForeignKey(name= "FK_animales_especies"))

    private Especie especie;
}
