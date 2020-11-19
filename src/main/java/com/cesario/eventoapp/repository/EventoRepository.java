package com.cesario.eventoapp.repository;

import com.cesario.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento, String> {
}
