package com.corenetworks.validaciones.servicio;


import com.corenetworks.validaciones.dTO.ResumenDto;
import com.corenetworks.validaciones.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio extends ICRUD<Empleado, Integer>{
    public List<ResumenDto> obtenerResumenes();
}

