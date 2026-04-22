package com.upiiz.Practica2.entities.EntidadesDavid;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "participantes") // En plural como en tu base de datos
public class ParticipantesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long participante_id; // Cambiado a Long por buenas prácticas
    private String nombre;
    private String email;
    private String telefono;

    public ParticipantesEntity(){}

    public ParticipantesEntity(Long participante_id, String nombre, String email, String telefono)
    {
        this.participante_id = participante_id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public Long getParticipante_id()
    {
        return participante_id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getEmail()
    {
        return email;
    }

    public String getTelefono()
    {
        return telefono;
    }

    //Setters ya con sus variables en los paréntesis
    public void setParticipante_id(Long participante_id)
    {
        this.participante_id = participante_id;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
}