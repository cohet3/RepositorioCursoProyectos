package com.example.demoCapas.repositorio;

import com.example.demoCapas.modelo.Factura;
import org.springframework.stereotype.Repository;

@Repository
public class RepoFactura implements IRepoFactura {


    @Override
    public String insertar(Factura f) {
        return String.format("Capa repo simulando BBDD %s", f.toString());
    }
}
