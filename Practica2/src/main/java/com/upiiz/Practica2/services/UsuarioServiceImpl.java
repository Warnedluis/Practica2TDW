package com.upiiz.Practica2.services;

import com.upiiz.Practica2.entities.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;
import com.upiiz.Practica2.respositories.UsuarioRepository;

import java.util.List;

@Service

public class UsuarioServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public UsuarioEntity guardarUsuario(UsuarioEntity usuario)
    {
        usuario.setContrasenia(passwordEncoder.encode(usuario.getContrasenia()));
        return usuarioRepository.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        System.out.println("=== INTENTANDO LOGUEAR ===");
        System.out.println("Buscando el correo: " + email);

        UsuarioEntity usuario = usuarioRepository.findByEmail(email);

        if(usuario == null) {
            System.out.println("RESULTADO: Usuario NO encontrado en la base de datos.");
            throw new UsernameNotFoundException("Email no encontrado en la base de datos");
        }

        System.out.println("RESULTADO: Usuario SÍ encontrado.");
        System.out.println("Hash en la base de datos: " + usuario.getContrasenia());
        System.out.println("==========================");

        return User.builder()
                .username(usuario.getEmail())
                .password(usuario.getContrasenia())
                .roles("USER")
                .build();
    }

    public List<UsuarioEntity> listarUsuarios()
    {
        return usuarioRepository.findAll();
    }

    public UsuarioEntity crearUsuario(UsuarioEntity usuario)
    {
        return usuarioRepository.save(usuario);
    }

    public UsuarioEntity actualizarUsuario(UsuarioEntity usuario)
    {
        return usuarioRepository.save(usuario);
    }

    public void borrarUsuario(Long id)
    {
        usuarioRepository.deleteById(id);
    }






}
