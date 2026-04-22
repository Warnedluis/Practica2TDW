package com.upiiz.Practica2.services.ServiciosLuis;

import com.upiiz.Practica2.entities.EntidadesLuis.LibroEntity;

import java.util.List;


public interface LibroService {
    List<LibroEntity> listarLibros();
    LibroEntity crearLibro(LibroEntity libro);
    LibroEntity actualizarLibro(LibroEntity libro);
    void borrarLibro(Long id_Libro);
    LibroEntity getLibroPorId(Long id_Libro);

}
