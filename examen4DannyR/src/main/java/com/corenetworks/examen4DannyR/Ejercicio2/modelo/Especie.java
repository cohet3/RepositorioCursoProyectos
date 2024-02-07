package com.corenetworks.examen4DannyR.Ejercicio2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "especies")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecie;
    @Column(length = 60,nullable = false)
    private String nomberVulgar;
    @Column(length = 60,nullable = false)
    private String nombreCientifico;
    private boolean extincion;

    @OneToMany(mappedBy = "especie",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Animal> animales;

}
