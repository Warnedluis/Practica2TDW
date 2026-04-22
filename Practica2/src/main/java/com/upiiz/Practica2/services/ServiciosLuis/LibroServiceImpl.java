package com.upiiz.Practica2.services.ServiciosLuis;

import com.upiiz.Practica2.entities.EntidadesLuis.LibroEntity;
import com.upiiz.Practica2.respositories.RepositoriesLuis.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl {

    @Autowired
    public LibroRepository libroRepository;

    public List<LibroEntity> listarLibros()
    {
        return libroRepository.findAll();
    }

    public LibroEntity crearLibro(LibroEntity libroEntity)
    {
        return libroRepository.save(libroEntity);
    }

    public LibroEntity actualizarLibro(LibroEntity libroEntity)
    {
        return libroRepository.save(libroEntity);
    }

    public void borrarLibro(Long id_Libro)
    {
        libroRepository.deleteById(id_Libro);
    }

    public Optional<LibroEntity> getLibroPorId(Long id_Libro)
    {
        return libroRepository.findById(id_Libro);
    }
}
