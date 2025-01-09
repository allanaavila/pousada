package com.pousadasolnascente.repository;

import com.pousadasolnascente.model.entity.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepository extends JpaRepository<Foto, Long> {
    Foto findByDescricao(String descricao);
}
