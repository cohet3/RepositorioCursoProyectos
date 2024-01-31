package com.example.demoCapas.servicio;

import com.example.demoCapas.modelo.Factura;
import com.example.demoCapas.repositorio.IRepoFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioFactura implements IServicioFactura{
    @Autowired
    private IRepoFactura capaRepo;
    @Override
    public String insertar(Factura f) {
        return capaRepo.insertar(f);
    }
}
