package com.upiiz.Practica2.services.ServiciosLuis;

import com.upiiz.Practica2.entities.EntidadesLuis.AutorEntity;

import java.util.List;

public interface AutorService {

    List<AutorEntity> listarAutores();
    AutorEntity crearAutor(AutorEntity autorEntity);
    AutorEntity actualizarAutor(AutorEntity autorEntity);
    void eliminarAutor(Long id_Autor);
    AutorEntity getAutorPorId(Long id_Autor);
}
