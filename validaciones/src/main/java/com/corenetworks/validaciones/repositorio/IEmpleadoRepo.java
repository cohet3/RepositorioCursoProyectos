package com.corenetworks.validaciones.repositorio;

import com.corenetworks.validaciones.dTO.ResumenDto;
import com.corenetworks.validaciones.modelo.Empleado;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEmpleadoRepo extends IGenericoRepo<Empleado, Integer> {
    @Query(value="select count(id_empledo) as contador, avg(sueldo) as sueldo_promedio from empleados", nativeQuery = true )
    public List<ResumenDto> obtenerResumenes();
}
