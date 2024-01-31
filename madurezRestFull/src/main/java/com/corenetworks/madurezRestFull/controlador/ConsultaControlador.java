package com.corenetworks.madurezRestFull.controlador;


import com.corenetworks.madurezRestFull.excepciones.ExceptionNoEncontrado;
import com.corenetworks.madurezRestFull.modelo.ConsultaMedica;
import com.corenetworks.madurezRestFull.servicio.IConsultaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaControlador {
    @Autowired
    private IConsultaServicio servicio;
    @GetMapping
    public List<ConsultaMedica> consultarTodas(){
     return servicio.consultaTodos();
    }
    @PostMapping
    public ResponseEntity <ConsultaMedica> crear(@RequestBody ConsultaMedica cm){
        ConsultaMedica cMBD= servicio.crear(cm);
        return new ResponseEntity<>(cMBD, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<ConsultaMedica> consultarUno(@PathVariable("id") int id){
        ConsultaMedica cm = servicio.consultaUno(id);
        if(cm==null){
            throw new ExceptionNoEncontrado("recurso no encontrado" +id);
        }
        return new ResponseEntity<>(cm, HttpStatus.OK);
    }
}
