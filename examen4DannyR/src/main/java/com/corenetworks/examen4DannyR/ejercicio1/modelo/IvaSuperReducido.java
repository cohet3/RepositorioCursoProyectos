package com.corenetworks.examen4DannyR.ejercicio1.modelo;

import org.springframework.stereotype.Component;

@Component
public class IvaSuperReducido implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p) {
        double ivaReducido = p.getPrecio()*0.04;
        return ivaReducido;
    }
}
