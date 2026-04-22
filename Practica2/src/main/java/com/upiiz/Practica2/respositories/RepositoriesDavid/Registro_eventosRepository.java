package com.upiiz.Practica2.respositories.RepositoriesDavid;

import com.upiiz.Practica2.entities.EntidadesDavid.Registro_eventosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Registro_eventosRepository extends JpaRepository<Registro_eventosEntity, Long> {
}
