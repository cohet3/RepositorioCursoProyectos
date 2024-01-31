package com.example.demoCapas.repositorio;

import com.example.demoCapas.modelo.Inmueble;
import com.example.demoCapas.modelo.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public class RepoInmueble implements IRepoInmueble{
    @Override
    public String insertar(Inmueble i) {
        return String.format("Capa repo %s", i.toString());
    }
}
