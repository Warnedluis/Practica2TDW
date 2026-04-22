package com.upiiz.Practica2.respositories.RepositoriesLuis;

import com.upiiz.Practica2.entities.EntidadesLuis.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<LibroEntity, Long>
{

}
