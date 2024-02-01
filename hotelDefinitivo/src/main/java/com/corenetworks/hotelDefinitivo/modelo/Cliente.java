package com.corenetworks.hotelDefinitivo.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(length = 60)
    private String nombre;
    @Column(length = 60)
    private String direccion;
    @Column(length = 9)
    private String telefono;

    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Mascota> mascotas;
}
