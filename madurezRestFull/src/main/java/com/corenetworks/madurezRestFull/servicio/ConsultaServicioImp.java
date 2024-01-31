package com.corenetworks.madurezRestFull.servicio;

import com.corenetworks.madurezRestFull.modelo.ConsultaMedica;
import com.corenetworks.madurezRestFull.repositorio.IConsultaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConsultaServicioImp implements IConsultaServicio{
    @Autowired
    private IConsultaRepositorio repo;

    @Override
    public ConsultaMedica crear(ConsultaMedica cm) {
        return repo.save(cm);
    }

    @Override
    public ConsultaMedica modificar(ConsultaMedica cm) {
        return repo.save(cm);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);

    }

    @Override
    public ConsultaMedica consultaUno(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<ConsultaMedica> consultaTodos() {
        return repo.findAll();
    }
}
