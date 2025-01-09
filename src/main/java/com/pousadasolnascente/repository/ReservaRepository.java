package com.pousadasolnascente.repository;

import com.pousadasolnascente.model.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{
    List<Reserva> findByUsuarioId(Long usuarioId);
    List<Reserva> findBySituacao(String situacao);
}
