package com.corenetworks.demoCapas2.repositorio;

import com.corenetworks.demoCapas2.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepositorio extends JpaRepository<Pedido, Integer> {
}
