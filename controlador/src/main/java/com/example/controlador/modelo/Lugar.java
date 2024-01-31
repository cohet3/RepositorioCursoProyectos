package com.example.controlador.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@Data
@Entity
@Table(name = "lugares")
public class Lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLugar;
    @Column(length =60, nullable = false)
    private String nombre;

/*        @OneToMany(mappedBy = "lugar",
                cascade = CascadeType.ALL,
                fetch= FetchType.EAGER)

        private List<Visita> visitas;*/

    public Lugar(int idLugar, String nombre) {
        this.idLugar = idLugar;
        this.nombre = nombre;
    }
}
