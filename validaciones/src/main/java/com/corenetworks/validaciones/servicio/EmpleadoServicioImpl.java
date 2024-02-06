package com.corenetworks.validaciones.servicio;

import com.corenetworks.validaciones.modelo.Empleado;
import com.corenetworks.validaciones.repositorio.IGenericoRepo;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServicioImpl extends CRUDImpl<Empleado, Integer> implements  IEmpleadoServicio{
    //private IEmpleadoRepo
    @Override
    protected IGenericoRepo<Empleado, Integer> getRepo() {
        return null;
    }
}
