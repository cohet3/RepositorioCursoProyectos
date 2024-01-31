package com.example.demoCapas.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Factura {
    private int idFactura;
    private LocalDate fFactura;
    private double importe;

    public Factura(int i, LocalDate of, int i1) {
    }
}
