package com.example.controlador.servicio;



import com.example.controlador.modelo.Lugar;

import java.util.List;

public interface ILugarServicio {
    Lugar insertar(Lugar l);
    Lugar modificar(Lugar l);
    void eliminar(int idLugar);
    List<Lugar> obtenerTodos();
    Lugar obtenerUno(int idLugar);
}
