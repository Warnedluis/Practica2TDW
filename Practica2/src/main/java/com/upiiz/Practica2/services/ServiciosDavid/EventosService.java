package com.upiiz.Practica2.services.ServiciosDavid;

import com.upiiz.Practica2.entities.EntidadesDavid.EventosEntity;
import java.util.List;
import java.util.Optional; // Agregamos Optional por buenas prácticas al buscar por ID

public interface EventosService {
    List<EventosEntity> listarEventos();
    EventosEntity crearEvento(EventosEntity eventoEntity);
    EventosEntity actualizarEvento(EventosEntity eventoEntity);
    void eliminarEvento(Long evento_id);
    Optional<EventosEntity> getEventoPorId(Long evento_id); // Mejor devolver un Optional
}
