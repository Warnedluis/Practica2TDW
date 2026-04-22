package com.upiiz.Practica2.entities.EntidadesDavid;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "registro_eventos") // Cambie lo del Nombre exacto de la BD
public class Registro_eventosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registro_id;
    private Long evento_id;
    private Long participante_id;
    private Date fecha_registro;
    private boolean asistencia;

    public Registro_eventosEntity()
    {

    }

    public Registro_eventosEntity(Long registro_id, Long evento_id, Long participante_id ,Date fecha_registro, boolean asistencia )
    {
        this.registro_id = registro_id;
        this.evento_id  = evento_id;
        this.participante_id = participante_id; // ARREGLO 4: Corregido el dedazo
        this.fecha_registro = fecha_registro;
        this.asistencia = asistencia;
    }

    // Las  ayusculas despues del get we

    public Long getRegistro_id()
    {
        return registro_id;
    }

    public Long getEvento_id()
    {
        return evento_id;
    }

    public Long getParticipante_id()
    {
        return participante_id;
    }

    public Date getFecha_registro()
    {
        return fecha_registro;
    }

    public boolean getAsistencia()
    {
        return asistencia;
    }

    // Lo de los parentesis

    public void setRegistro_id(Long registro_id)
    {
        this.registro_id = registro_id;
    }

    public void setEvento_id(Long evento_id)
    {
        this.evento_id = evento_id;
    }

    public void setParticipante_id(Long participante_id)
    {
        this.participante_id = participante_id;
    }

    public void setFecha_registro(Date fecha_registro)
    {
        this.fecha_registro = fecha_registro;
    }

    public void setAsistencia(boolean asistencia)
    {
        this.asistencia = asistencia;
    }
}