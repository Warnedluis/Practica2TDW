package com.upiiz.Practica2.respositories.RepositoriesLuis;

import com.upiiz.Practica2.entities.EntidadesDavid.EventosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventosRepository extends JpaRepository<EventosEntity, Long> {
}
