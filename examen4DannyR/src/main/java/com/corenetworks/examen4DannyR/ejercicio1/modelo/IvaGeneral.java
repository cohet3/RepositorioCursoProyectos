package com.corenetworks.examen4DannyR.ejercicio1.modelo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class IvaGeneral implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p) {
        double ivaGeneral = p.getPrecio()*0.21;
        return ivaGeneral;
    }


}
