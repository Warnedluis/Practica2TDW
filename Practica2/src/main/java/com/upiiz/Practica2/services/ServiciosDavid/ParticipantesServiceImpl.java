package com.upiiz.Practica2.services.ServiciosDavid;

import com.upiiz.Practica2.entities.EntidadesDavid.ParticipantesEntity;
import com.upiiz.Practica2.respositories.RepositoriesDavid.ParticipantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Etiqueta obligatoria para que Spring Boot lo reconozca
@Service
public class ParticipantesServiceImpl implements ParticipantesService {

    // Conectamos con el repositorio de Participantes
    @Autowired
    ParticipantesRepository participantesRepository;

    @Override
    public List<ParticipantesEntity> listarParticipantes() {
        // Trae todos los registros de la tabla
        return (List<ParticipantesEntity>) participantesRepository.findAll();
    }

    @Override
    public ParticipantesEntity crearParticipante(ParticipantesEntity participanteEntity) {
        // Guarda un nuevo participante
        return participantesRepository.save(participanteEntity);
    }

    @Override
    public ParticipantesEntity actualizarParticipante(ParticipantesEntity participanteEntity) {
        // Actualiza un participante existente
        return participantesRepository.save(participanteEntity);
    }

    @Override
    public void eliminarParticipante(Long participante_id) {
        // Elimina por ID
        participantesRepository.deleteById(participante_id);
    }

    @Override
    public Optional<ParticipantesEntity> getParticipantePorId(Long participante_id) {
        // Busca a un participante en específico
        return participantesRepository.findById(participante_id);
    }
}