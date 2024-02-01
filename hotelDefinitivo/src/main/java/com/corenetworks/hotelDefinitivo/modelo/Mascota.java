package com.corenetworks.hotelDefinitivo.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mascotas")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMascota;
    @Column(length = 60)
    private String nombre;
    @Column(length = 50)
    private String raza;
    private int edad;
    @Column(length = 30)
    private String tamano;
    @Column (length = 30)
    private String tipoMascota;

    @ManyToOne
    @JoinColumn(name="idCliente",nullable = false,foreignKey = @ForeignKey(name="FK_mascotas_clientes"))

    private Cliente cliente;

}
