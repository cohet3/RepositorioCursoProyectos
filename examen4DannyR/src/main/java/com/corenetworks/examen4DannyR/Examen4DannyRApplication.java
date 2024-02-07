package com.corenetworks.examen4DannyR;

import com.corenetworks.examen4DannyR.ejercicio1.modelo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Examen4DannyRApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Examen4DannyRApplication.class, args);
	}
	@Autowired
	Factura f1;
	@Override
	public void run(String... args) throws Exception {
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto("lapiz", 22));
		productos.add(new Producto("cuaderno", 32));
		productos.add(new Producto("libro", 52));



		f1.setProductos(productos);
		System.out.println("IVA General " + f1.calcularTotalFactura()+" €");

		/*System.out.println("IVA Reducido " + f1.calcularTotalFactura()+" €");
*/

	}
}
