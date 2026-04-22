package com.upiiz.Practica2.services.ServiciosDavid;

import com.upiiz.Practica2.entities.EntidadesDavid.ParticipantesEntity;
import java.util.List;
import java.util.Optional;

public interface ParticipantesService {
    List<ParticipantesEntity> listarParticipantes();
    ParticipantesEntity crearParticipante(ParticipantesEntity participanteEntity);
    ParticipantesEntity actualizarParticipante(ParticipantesEntity participanteEntity);
    void eliminarParticipante(Long participante_id);
    Optional<ParticipantesEntity> getParticipantePorId(Long participante_id);
}