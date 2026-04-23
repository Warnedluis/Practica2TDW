package com.upiiz.Practica2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController{


    @GetMapping("/MostrarInicio")
    public String mostrarInicio() {
        return "home";
    }

}
