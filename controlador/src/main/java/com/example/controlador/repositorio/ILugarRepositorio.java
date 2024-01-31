package com.example.controlador.repositorio;


import com.example.controlador.modelo.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugarRepositorio extends JpaRepository<Lugar, String> {
}
