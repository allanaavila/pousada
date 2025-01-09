package com.pousadasolnascente.repository;

import com.pousadasolnascente.model.entity.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    List<Avaliacao> findByUsuarioId(Long usuarioId);
    List<Avaliacao> findByNota(double nota);
}
