package com.upiiz.Practica2.services.ServiciosDavid;

import com.upiiz.Practica2.entities.EntidadesDavid.Registro_eventosEntity;
import com.upiiz.Practica2.respositories.RepositoriesDavid.Registro_eventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Registro_eventosServiceImpl {
    @Autowired
    private Registro_eventosRepository registroEventosRepository;

    public List<Registro_eventosEntity> listarRegistros_event()
    {
        return registroEventosRepository.findAll();
    }

    public Registro_eventosEntity crearRegistro_eventos(Registro_eventosEntity registro_eventos)
    {
        return registroEventosRepository.save(registro_eventos);
    }


}
