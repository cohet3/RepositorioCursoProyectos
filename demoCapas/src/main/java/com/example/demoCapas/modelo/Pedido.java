package com.example.demoCapas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Pedido {
    @Value("1")
    private int idPedido;
    @Value("2023-02-22")
    private LocalDate fPedido;
    @Value("Empresa")
    private String fEnvio;
    @Value("Credito")
    private String fPago;
    @Value("300.5")
    private double importe;

}
