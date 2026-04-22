package com.upiiz.Practica2.entities.EntidadesLuis;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity( name = "autor")
public class AutorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Autor;
    private String Nombre_Autor;
    private String Nacionalidad_Autor;

    public AutorEntity()
    {

    }

    public AutorEntity(Long id_Autor, String Nombre_Autor, String Nacionalidad_Autor)
    {
        this.id_Autor = id_Autor;
        this.Nombre_Autor = Nombre_Autor;
        this.Nacionalidad_Autor = Nacionalidad_Autor;
    }

    public Long getId_Autor()
    {
        return id_Autor;
    }

    public String getNombre_Autor()
    {
        return Nombre_Autor;
    }

    public String getNacionalidad_Autor()
    {
        return Nacionalidad_Autor;
    }

    public void setId_Autor(Long id_Autor)
    {
        this.id_Autor = id_Autor;
    }

    public void setNombre_Autor(String Nombre_Autor)
    {
        this.Nombre_Autor = Nombre_Autor;
    }

    public void setNacionalidad_Autor(String Nacionalidad_Autor)
    {
        this.Nacionalidad_Autor = Nacionalidad_Autor;
    }
}
