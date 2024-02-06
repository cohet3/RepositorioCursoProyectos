package com.corenetworks.validaciones.servicio;

import com.corenetworks.validaciones.dTO.ResumenDto;
import com.corenetworks.validaciones.modelo.Empleado;
import com.corenetworks.validaciones.repositorio.IEmpleadoRepo;
import com.corenetworks.validaciones.repositorio.IGenericoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicioImpl extends CRUDImpl<Empleado, Integer> implements  IEmpleadoServicio{
    @Autowired
    private IEmpleadoRepo repo;
    @Override
    protected IGenericoRepo<Empleado, Integer> getRepo() {
        return repo;
    }

    @Override
    public List<ResumenDto> obtenerResumenes() {
        return repo.obtenerResumenes();
    }
}
