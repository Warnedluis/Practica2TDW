package com.upiiz.Practica2.services.ServiciosDavid;

import com.upiiz.Practica2.entities.EntidadesDavid.EventosEntity;
import com.upiiz.Practica2.respositories.RepositoriesLuis.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// ARREGLO 1: Le decimos a Spring Boot que esta clase es un Servicio
@Service
public class EventosServiceImpl implements EventosService {

    // ARREGLO 2: Inyectamos el repositorio para poder usar la base de datos
    @Autowired
    EventosRepository eventosRepository;

    @Override
    public List<EventosEntity> listarEventos() {
        // findAll() trae todo de la tabla
        return (List<EventosEntity>) eventosRepository.findAll();
    }

    @Override
    public EventosEntity crearEvento(EventosEntity eventoEntity) {
        // save() sirve tanto para guardar nuevos como para actualizar
        return eventosRepository.save(eventoEntity);
    }

    @Override
    public EventosEntity actualizarEvento(EventosEntity eventoEntity) {
        return eventosRepository.save(eventoEntity);
    }

    @Override
    public void eliminarEvento(Long evento_id) {
        // deleteById() borra usando la llave primaria
        eventosRepository.deleteById(evento_id);
    }

    @Override
    public Optional<EventosEntity> getEventoPorId(Long evento_id) {
        // findById() busca un evento en específico
        return eventosRepository.findById(evento_id);
    }
}