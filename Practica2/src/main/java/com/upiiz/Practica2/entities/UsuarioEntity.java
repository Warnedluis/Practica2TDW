package com.upiiz.Practica2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios") // Nombre de la tabla en plural
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private String contrasenia;

    public UsuarioEntity()
    {

    }

    public UsuarioEntity(Long id, String nombre, String primerApellido, String segundoApellido, String email, String contrasenia)
    {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public Long getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getPrimerApellido()
    {
        return primerApellido;
    }

    public String getSegundoApellido()
    {
        return segundoApellido;
    }

    public String getEmail()
    {
        return email;
    }

    public String getContrasenia()
    {
        return contrasenia;
    }

    // lo del parentesis pa
    public void setId(Long id)
    {
        this.id = id;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setPrimerApellido(String primerApellido)
    {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido)
    {
        this.segundoApellido = segundoApellido;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setContrasenia(String contrasenia)
    {
        this.contrasenia = contrasenia;
    }
}