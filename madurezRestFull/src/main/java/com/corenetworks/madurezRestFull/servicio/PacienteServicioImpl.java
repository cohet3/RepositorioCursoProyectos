package com.corenetworks.madurezRestFull.servicio;

import com.corenetworks.madurezRestFull.modelo.Paciente;
import com.corenetworks.madurezRestFull.repositorio.IGenericoRepositorio;
import com.corenetworks.madurezRestFull.repositorio.IPacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServicioImpl extends ICRUDImpl<Paciente, Integer> implements IPacienteServicio {
    @Autowired
    private IPacienteRepositorio repo;
    @Override
    protected IGenericoRepositorio<Paciente, Integer> getRepo() {
        return repo;
    }
}
