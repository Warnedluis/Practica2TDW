package com.upiiz.Practica2.controllers;

// Asegúrate de que estos imports coincidan con tus carpetas
import com.upiiz.Practica2.services.ServiciosLuis.AutorServiceImpl;
import com.upiiz.Practica2.services.ServiciosLuis.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    AutorServiceImpl autorService;

    @Autowired
    LibroServiceImpl libroService;

    @GetMapping("/MostrarInicio")
    public String mostrarInicio(Model model) {
        // AQUÍ ESTÁ LA MAGIA: Le pasamos las listas al HTML
        model.addAttribute("listaAutores", autorService.listarAutores());
        model.addAttribute("listaLibros", libroService.listarLibros());

        return "home";
    }
}