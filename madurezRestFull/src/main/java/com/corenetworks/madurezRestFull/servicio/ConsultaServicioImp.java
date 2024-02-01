package com.corenetworks.madurezRestFull.servicio;

import com.corenetworks.madurezRestFull.modelo.ConsultaMedica;
import com.corenetworks.madurezRestFull.repositorio.IConsultaRepositorio;
import com.corenetworks.madurezRestFull.repositorio.IGenericoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConsultaServicioImp extends ICRUDImpl<ConsultaMedica, Integer> implements IConsultaServicio{
    @Autowired
    private IConsultaRepositorio repo;


    @Override
    protected IGenericoRepositorio<ConsultaMedica, Integer> getRepo() {
        return repo;
    }
}
