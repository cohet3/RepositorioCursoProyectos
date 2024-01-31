package com.corenetworks.demoCapas2;

import com.corenetworks.demoCapas2.modelo.Pedido;
import com.corenetworks.demoCapas2.servicio.IpedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootApplication
public class DemoCapas2Application implements CommandLineRunner {
	@Autowired
	private IpedidoServicio servicio;
	public static void main(String[] args) {
		SpringApplication.run(DemoCapas2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido p1= new Pedido(0, LocalDate.now(), "EFEC", 300);
		Pedido p2= new Pedido(2, LocalDate.now(), "EFEC", 500);
		System.out.println(servicio.insertar(p1));
		//System.out.println(servicio.modificar(p2));
		//servicio.eliminar(1);
		Optional<Pedido> oP1= Optional.of(new Pedido(2, LocalDate.now(), "efec", 100));
		System.out.println("¿esta vacio? "+oP1.isEmpty());
		System.out.println("Existe un objeto ? "+oP1.isPresent());
		System.out.println(servicio.obtenerUno(2));
		System.out.println(servicio.obtenerTodos());

	}
}
