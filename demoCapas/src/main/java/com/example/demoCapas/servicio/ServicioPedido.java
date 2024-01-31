package com.example.demoCapas.servicio;

import com.example.demoCapas.modelo.Pedido;
import com.example.demoCapas.repositorio.IRepoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPedido implements IServicioPedido{
    @Autowired
    private IRepoPedido capaRepo;

    public String insertar(Pedido p) {
        return capaRepo.insertar(p);
    }

}
