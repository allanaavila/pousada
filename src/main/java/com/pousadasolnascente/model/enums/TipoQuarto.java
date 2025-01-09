package com.pousadasolnascente.model.enums;

import java.math.BigDecimal;

public enum TipoQuarto {
    SIMPLES("Quarto Simples", new BigDecimal("100.00")),
    LUXO("Quarto Luxo", new BigDecimal("250.00")),
    FAMILIA("Quarto Família", new BigDecimal("300.00"));

    private final String descricao;
    private final BigDecimal diaria;

    TipoQuarto(String descricao, BigDecimal diaria) {
        this.descricao = descricao;
        this.diaria = diaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getDiaria() {
        return diaria;
    }
}
