package com.upiiz.Practica2.services.ServiciosLuis;


import com.upiiz.Practica2.entities.EntidadesLuis.AutorEntity;
import com.upiiz.Practica2.respositories.RepositoriesLuis.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorServiceImpl {

    @Autowired
    public AutorRepository autorRepository;

    public List<AutorEntity> listarAutores()
    {
        return autorRepository.findAll();
    }

    public AutorEntity crearAutor(AutorEntity autor)
    {
        return autorRepository.save(autor);
    }

    public AutorEntity actualizarAutor(AutorEntity autor)
    {
        return autorRepository.save(autor);
    }

    public void eliminarAutor(Long id_Autor)
    {
        autorRepository.deleteById(id_Autor);
    }

    public Optional<AutorEntity> getAutorPorId(Long id_Autor)
    {
        return autorRepository.findById(id_Autor);
    }

}
