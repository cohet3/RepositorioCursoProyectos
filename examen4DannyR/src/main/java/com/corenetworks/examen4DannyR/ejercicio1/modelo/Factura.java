package com.corenetworks.examen4DannyR.ejercicio1.modelo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Component
public class Factura {
    @Autowired
    private IImpuesto impuesto;
    private List<Producto> productos;
    public double calcularTotalFactura(){
        double total=0;
        for (Producto elemento:productos
        ) {
            total+=elemento.getPrecio()+impuesto.calcularImpuesto(elemento);
        }
        return total;
    }
}
