package com.corenetworks.madurezRestFull.controlador;


import com.corenetworks.madurezRestFull.excepciones.ExceptionNoEncontrado;
import com.corenetworks.madurezRestFull.modelo.ConsultaMedica;
import com.corenetworks.madurezRestFull.modelo.Medico;
import com.corenetworks.madurezRestFull.modelo.Paciente;
import com.corenetworks.madurezRestFull.servicio.IMedicoServicioImp;
import com.corenetworks.madurezRestFull.servicio.IPacienteServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {
    @Autowired
    private IMedicoServicioImp servicio;
    @GetMapping
    public List<Medico> consultarTodas(){
     return servicio.consultaTodos();
    }
    @PostMapping
    public ResponseEntity <Medico> crear(@RequestBody Medico m){
        Medico cMBD= servicio.crear(m);
        return new ResponseEntity<>(cMBD, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<Medico> consultarUno(@PathVariable("id") int id){
        Medico cm = servicio.consultaUno(id);
        if(cm==null){
            throw new ExceptionNoEncontrado("recurso no encontrado" +id);
        }
        return new ResponseEntity<>(cm, HttpStatus.OK);
    }
    @PutMapping
    public  ResponseEntity<Medico> consultarUnoAntes(@RequestBody Medico cm){
        Medico cmBD = servicio.consultaUno(cm.getIdMedico());
        if(cmBD==null){
            throw new ExceptionNoEncontrado("recurso no encontrado" +cm.getIdMedico());
        }
        return new ResponseEntity<>(servicio.modificar(cm), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar (@PathVariable int id){
        Medico cmBD = servicio.consultaUno(id);
        if(cmBD==null){
            throw new ExceptionNoEncontrado("recurso no encontrado->" +id);
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
