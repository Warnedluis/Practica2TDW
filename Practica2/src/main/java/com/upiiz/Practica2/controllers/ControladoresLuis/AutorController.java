package com.upiiz.Practica2.controllers.ControladoresLuis;

import com.upiiz.Practica2.entities.EntidadesLuis.AutorEntity;
import com.upiiz.Practica2.services.ServiciosLuis.AutorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/TablasFormulariosLuis")
public class AutorController {

    @Autowired
    AutorServiceImpl autorServiceImpl;

    //Create - C
    @GetMapping("/MostrarFormularioCrearAutor")
    public String mostrarFormularioCrearAutor(Model model)
    {
        AutorEntity autor = new AutorEntity();
        model.addAttribute("autor", autor);
        return "TablasFormulariosLuis/FormularioCrearAutor";
    }

    // ARREGLO 1: Le pusimos un nombre para que no choque con el de actualizar
    @PostMapping("/CrearAutor")
    public String crearAutor(@ModelAttribute AutorEntity autor)
    {
        autorServiceImpl.crearAutor(autor);
        // ARREGLO 2: Le pusimos la ruta completa para que encuentre la tabla
        return "redirect:/TablasFormulariosLuis/TablasAutores";
    }

    //Read - R
    @GetMapping("/MostrarTablaAutores")
    public String mostrarTablaAutores(Model model)
    {
        List<AutorEntity> listadoAutores = autorServiceImpl.listarAutores();
        model.addAttribute("autores", listadoAutores);
        return "/TablasFormulariosLuis/TablasAutores";
    }

    //Upadte - U
    // ARREGLO 3: Le agregamos el {id_Autor} para que reciba el numero
    @GetMapping("/MostrarFormularioActualizarAutor/{id_Autor}")
    public String mostrarFormularioActualizarAutor(@PathVariable Long id_Autor, Model model)
    {
        Optional<AutorEntity> autor = autorServiceImpl.getAutorPorId(id_Autor);
        model.addAttribute("autor", autor);
        return "/TablasFormulariosLuis/FormularioActualizarAutor";
    }

    // ARREGLO 4: Le pusimos nombre diferente al post para que no nos valla a dar error we
    @PostMapping("/GuardarActualizacionAutor")
    public String actualizarAutor(@ModelAttribute AutorEntity autor)
    {
        autorServiceImpl.actualizarAutor(autor);
        return "redirect:/Autor/TablasAutores";
    }

    //Delete - D
    // ARREGLO 5: Le agregamos el {id_Autor} igual que arriba
    @GetMapping("/EliminarAutor/{id_Autor}")
    public String eliminarAutor(@PathVariable Long id_Autor)
    {
        autorServiceImpl.eliminarAutor(id_Autor);
        return "redirect:/TablasFormulariosLuis/TablasAutores";
    }
}