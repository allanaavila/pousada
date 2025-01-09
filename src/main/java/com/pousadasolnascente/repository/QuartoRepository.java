package com.pousadasolnascente.repository;

import com.pousadasolnascente.model.entity.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuartoRepository extends JpaRepository<Quarto, Long> {
    List<Quarto> findByTipoQuarto(String tipoQuarto);
    List<Quarto> findByComodidadesContains(String comodidade);

}
