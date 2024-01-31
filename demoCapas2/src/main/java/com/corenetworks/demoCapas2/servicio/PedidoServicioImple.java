package com.corenetworks.demoCapas2.servicio;

import com.corenetworks.demoCapas2.modelo.Pedido;
import com.corenetworks.demoCapas2.repositorio.IPedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServicioImple implements IpedidoServicio{
    @Autowired
    private IPedidoRepositorio repositorio;
    @Override
    public Pedido insertar(Pedido p) {
        return repositorio.save(p);
    }

    @Override
    public Pedido modificar(Pedido p) {
        return repositorio.save(p);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }

    @Override
    public Pedido obtenerUno(int id) {
        return repositorio.findById(id).orElse(new Pedido());
    }

    @Override
    public List<Pedido> obtenerTodos() {
        return repositorio.findAll();
    }
}
