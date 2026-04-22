package com.upiiz.Practica2.respositories.RepositoriesLuis;


import com.upiiz.Practica2.entities.EntidadesLuis.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity, Long> {
}
