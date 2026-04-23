package com.upiiz.Practica2.entities.EntidadesLuis;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros") // Cambiado a plural para coincidir con la base de datos
public class LibroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Libro; // Cambiado a id_libro
    private String Titulo_Libro;
    private Integer Anio_Publicacion_Libro; // Cambiado a Integer y con guion bajo

    //Agregamos el id_autor para la llave foránea
    private Long id_Autor;

    public LibroEntity()
    {

    }

    public LibroEntity(Long id_Libro, String Titulo_Libro, Integer Anio_Publicacion_Libro, Long id_Autor)
    {
        this.id_Libro = id_Libro;
        this.Titulo_Libro = Titulo_Libro;
        this.Anio_Publicacion_Libro = Anio_Publicacion_Libro;
        this.id_Autor = id_Autor;
    }

    // =====================================
    // Aqui te faltaron los "GET"
    public Long getId_Libro()
    {
        return id_Libro;
    }

    public String getTitulo_Libro()
    {
        return Titulo_Libro;
    }

    public Integer getAnio_Publicacion_Libro()
    {
        return Anio_Publicacion_Libro;
    }

    public Long getId_Autor()
    {
        return id_Autor;
    }

    //Igual lo de los parentesis we

    public void setId_Libro(Long id_Libro)
    {
        this.id_Libro = id_Libro;
    }

    public void setTitulo_Libro(String Titulo_Libro)
    {
        this.Titulo_Libro = Titulo_Libro;
    }

    public void setAnio_Publicacion_Libro(Integer Anio_Publicacion_Libro)
    {
        this.Anio_Publicacion_Libro = Anio_Publicacion_Libro;
    }

    public void setId_Autor(Long id_Autor)
    {
        this.id_Autor = id_Autor;
    }
}