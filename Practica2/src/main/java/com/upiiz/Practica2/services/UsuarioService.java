package com.upiiz.Practica2.services;

import com.upiiz.Practica2.entities.UsuarioEntity;

import java.util.List;

public interface UsuarioService {

    List<UsuarioEntity> listarUsuarios();
    UsuarioEntity actualizarUsuario(UsuarioEntity usuario);
    UsuarioEntity crearUsuario(UsuarioEntity usuario);
    void borrarUsuario(Long id);
}
