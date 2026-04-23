package com.upiiz.Practica2.controllers;


import com.upiiz.Practica2.entities.UsuarioEntity;
import com.upiiz.Practica2.services.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")

public class AuthController {
    //https://localhost:8080/auth/login


    //De las plantillas buscar las carpetas css, js y de plugins


    @Autowired
    UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/RegistrarUsuario")
    public String guardarUsuario(@ModelAttribute UsuarioEntity usuario)
    {
        usuarioServiceImpl.guardarUsuario(usuario);
        return "redirect:/auth/RegistroUsuarios/login?success";
    }

    @GetMapping("/RegistroUsuarios/login")
    public String login()
    {
        return "RegistroUsuarios/Login";
    }

    @GetMapping("/RegistroUsuarios/register")
    public String register(Model model)
    {
        UsuarioEntity usuario = new UsuarioEntity();
        model.addAttribute("usuario", new UsuarioEntity());
        return "RegistroUsuarios/register";
    }

    @GetMapping("/RegistroUsuarios/forgot-password")
    public String forgot_password()
    {
        return "RegistroUsuarios/forgot-password";
    }

    @GetMapping("/Tablas/TablasLibros")
    public String TablaLibros()
    {
        return "/Tablas/TablaLibros";
    }


}
