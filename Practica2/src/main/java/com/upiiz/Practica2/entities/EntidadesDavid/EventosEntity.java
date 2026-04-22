package com.upiiz.Practica2.entities.EntidadesDavid;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity( name = "eventos")
public class EventosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evento_id;
    private String nombre;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String ubicacion;
    private Integer capacidad;

    public EventosEntity()
    {

    }

    public EventosEntity(Long evento_id, String nombre, String descripcion, Date fecha_inicio, Date fecha_fin, String ubicacion, Integer capacidad)
    {
        this.evento_id = evento_id;
        this.nombre  = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;

    }

    //Los getters siempre inician con una mayuscula

    public Long getEvento_id()
    {
        return evento_id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public Date getFecha_inicio()
    {
        return fecha_inicio;
    }

    public Date getFecha_fin()
    {
        return fecha_fin;
    }

    public String getUbicacion()
    {
        return ubicacion;
    }

    public Integer getCapacidad()
    {
        return capacidad;
    }

    //igual lo del parentesis bro

    public void setEvento_id(Long evento_id)
    {
        this.evento_id = evento_id;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public void setFecha_inicio(Date fecha_inicio)
    {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_fin(Date fecha_fin)
    {
        this.fecha_fin = fecha_fin;
    }

    public void setUbicacion(String ubicacion)
    {
        this.ubicacion = ubicacion;
    }

    public void setCapacidad(Integer capacidad)
    {
        this.capacidad = capacidad;
    }
}