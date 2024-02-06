package com.corenetworks.validaciones.controlador;

import com.corenetworks.validaciones.dTO.EmpleadoDTO;
import com.corenetworks.validaciones.dTO.ResumenDto;
import com.corenetworks.validaciones.excepciones.ExcepcionPersonalizadaNoEncontrado;
import com.corenetworks.validaciones.modelo.Empleado;
import com.corenetworks.validaciones.servicio.IEmpleadoServicio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoControlador {
    @Autowired
    private IEmpleadoServicio servicio;
    @PostMapping
    public ResponseEntity<EmpleadoDTO> crearEmpleado(@Valid @RequestBody EmpleadoDTO e){
        Empleado e1 = e.castEmpleado();
        e1= servicio.crear(e1);
        return new ResponseEntity<>(e.castEmpleadoADto(e1), HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<EmpleadoDTO> modificarEmpleado(@Valid @RequestBody EmpleadoDTO e){
        Empleado e1 = servicio.consultarUno(e.getIdEmpledo());
        if (e1==null){
            throw new ExcepcionPersonalizadaNoEncontrado("Empleado no encontrado id ->"+e.getIdEmpledo());
        }
        e1= servicio.modificar(e.castEmpleado());
        return new ResponseEntity<>(e.castEmpleadoADto(e1), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoDTO> consultarUno(@PathVariable(name = "id") Integer id){
        Empleado e1 = servicio.consultarUno(id);
        if (e1==null){
            throw new ExcepcionPersonalizadaNoEncontrado("Empleado no encontrado id ->"+id);
        }
        return new ResponseEntity<>((new EmpleadoDTO().castEmpleadoADto(e1)), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable(name = "id") Integer id){
        Empleado e1 = servicio.consultarUno(id);
        if (e1==null){
            throw new ExcepcionPersonalizadaNoEncontrado("Empleado no encontrado id ->"+id);
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping
    public ResponseEntity<List<EmpleadoDTO>> consultarTodos(){
        List<Empleado> empleadosBBDD= servicio.consultarTodos();
        List<EmpleadoDTO>empleadosDTo= new ArrayList<>();
        for (Empleado elemento: empleadosBBDD){
            empleadosDTo.add((new EmpleadoDTO().castEmpleadoADto(elemento)));
        }
        return new ResponseEntity<>(empleadosDTo, HttpStatus.OK);
    }
    public ResponseEntity<List<ResumenDto>> obtenerResumen(){
        return new ResponseEntity<>(servicio.obtenerResumenes(), HttpStatus.OK);
    }
}