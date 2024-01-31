package com.example.controlador.controlador;


import com.example.controlador.modelo.Lugar;
import com.example.controlador.servicio.ILugarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lugares")

public class LugarControlador {
    @Autowired
    private ILugarServicio lugarServicio;
    @GetMapping
    public List<Lugar> obtenerTodosLugar(){
        return lugarServicio.obtenerTodos();
    }
    @GetMapping("/{id}")

    public Lugar obtenerUnLugar(@PathVariable("id") int id){
        return lugarServicio.obtenerUno(id);
    }
    @PostMapping
    public Lugar insertarLugar(@RequestBody Lugar l1){

        return lugarServicio.insertar(l1);
    }
    @PutMapping
    public Lugar modificar(@RequestBody Lugar l1){
        return lugarServicio.modificar(l1);
    }
    @DeleteMapping("/id")
    public void eliminar(@PathVariable("id") int id){
         lugarServicio.eliminar(id);
    }

}
