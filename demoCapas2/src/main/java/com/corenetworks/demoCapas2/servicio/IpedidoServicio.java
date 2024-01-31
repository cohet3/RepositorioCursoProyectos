package com.corenetworks.demoCapas2.servicio;

import com.corenetworks.demoCapas2.modelo.Pedido;

import java.util.List;

public interface IpedidoServicio {
    //1.Crud q devuelve insertar: Pedido entonces declaramos
    //luego declaramos los metodos
    Pedido insertar(Pedido p);
    Pedido modificar(Pedido p);
    void eliminar(int id);
    Pedido obtenerUno(int id);
    List<Pedido> obtenerTodos();
}
