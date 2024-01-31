package com.example.demoCapas;

import com.example.demoCapas.modelo.Factura;
import com.example.demoCapas.modelo.Inmueble;
import com.example.demoCapas.modelo.Pedido;
import com.example.demoCapas.servicio.IServicioFactura;
import com.example.demoCapas.servicio.IServicioInmueble;
import com.example.demoCapas.servicio.IServicioPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoCapasApplication implements CommandLineRunner {
	//Siempre se instancia la interface
	@Autowired
	IServicioPedido capaServicio;
	@Autowired
	Pedido p1;
	@Autowired
	IServicioFactura capaServicioFactura;
	@Autowired
	IServicioInmueble capaServicioInmueble;


	public static void main(String[] args) {
		SpringApplication.run(DemoCapasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(capaServicio.insertar(p1));
		Factura f1= new Factura(1, LocalDate.of(2024, 11, 02),305);
		System.out.println(capaServicioFactura.insertar(f1));
		Inmueble i1= new Inmueble("1", "pequeña", "grande", "descripcion");
		System.out.println(capaServicioInmueble.insertar(i1));
	}
}
