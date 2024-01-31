package com.example.demoCapas.servicio;

import com.example.demoCapas.modelo.Factura;
import com.example.demoCapas.modelo.Inmueble;
import com.example.demoCapas.modelo.Pedido;
import com.example.demoCapas.repositorio.IRepoInmueble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioInmueble implements IServicioInmueble{
    @Autowired
    private IRepoInmueble capaRepo;


    @Override
    public String insertar(Inmueble i) {
        return capaRepo.insertar(i);
    }
}
