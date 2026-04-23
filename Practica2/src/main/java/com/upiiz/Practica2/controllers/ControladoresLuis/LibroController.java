package com.upiiz.Practica2.controllers.ControladoresLuis;

import com.upiiz.Practica2.entities.EntidadesLuis.AutorEntity;
import com.upiiz.Practica2.entities.EntidadesLuis.LibroEntity;
import com.upiiz.Practica2.services.ServiciosLuis.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/TablasFormulariosLuis")
public class LibroController {

    @Autowired
    LibroServiceImpl libroServiceImpl;

    //Creamos lo que es el crud de todo lo necesario

    //C - Create

    //Generamos el metodo get para traer un molde vacio de lo que es el servicio a generar

    @GetMapping("/MostrarFormularioCrearLibro")
    public String mostrarFormularioCrearLibro(Model model)
    {
        LibroEntity libro = new LibroEntity();
        model.addAttribute("libro",libro);
        return "TablasFormulariosLuis/FormularioCrearLibro";
    }

    //Ahora generamos lo que es el metodo post
    @PostMapping("/CrearLibro")
    public String crearLibro(@ModelAttribute LibroEntity libro)
    {
        libroServiceImpl.crearLibro(libro);
        return "redirect:/TablasFormulariosLuis/MostrarTablaLibros";
    }

    //R - Read

    @GetMapping("/MostrarTablaLibros")
    public String listarLibros(Model model)
    {
        List<LibroEntity> listaLibros = libroServiceImpl.listarLibros();
        model.addAttribute("libros", listaLibros);

        return "TablasFormulariosLuis/TablasLibros";
    }

    //U - Update

    @GetMapping("/MostrarFormularioActualizarLibro/{id_Libro}")
    public String mostrarFormularioActualizarLibros(@PathVariable Long id_Libro, Model model)
    {
        Optional<LibroEntity> libro = libroServiceImpl.getLibroPorId(id_Libro);
        model.addAttribute("libro", libro);
        return "TablasFormulariosLuis/FormularioActualizarLibro";
    }

    //Creamos el metodo post
    @PostMapping("/ActualizarLibro")
    public String actualizarLibro(@ModelAttribute LibroEntity libro)
    {
        libroServiceImpl.actualizarLibro(libro);
        return "redirect:/TablasFormulariosLuis/MostrarTablaLibros";
    }

    //D - Delete

    @GetMapping("/EliminarLibro/{id_Libro}")
    public String borrarLibro(@PathVariable Long id_Libro)
    {
        libroServiceImpl.borrarLibro(id_Libro);
        return "redirect:/TablasFormulariosLuis/MostrarTablaLibros";
    }

}
