package com.upiiz.Practica2.respositories.RepositoriesDavid;

import com.upiiz.Practica2.entities.EntidadesDavid.ParticipantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantesRepository extends JpaRepository<ParticipantesEntity,Long> {
}
