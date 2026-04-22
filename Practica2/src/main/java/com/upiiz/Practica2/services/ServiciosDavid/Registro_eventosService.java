package com.upiiz.Practica2.services.ServiciosDavid;

import com.upiiz.Practica2.entities.EntidadesDavid.Registro_eventosEntity;

import java.util.List;

public interface Registro_eventosService {

    List<Registro_eventosEntity> listarRegistrosEventos();
    Registro_eventosEntity crearRegistro_evento();
    Registro_eventosEntity actualizarRegistro_evento();
    void deleteRegistro_Evento();
}
