package com.pousadasolnascente.model.enums;

import java.math.BigDecimal;

public enum ServicosExtras {
    MASSAGEM(new BigDecimal("150.00"), "Massagem relaxante de 1 hora"),
    AULA_DE_DANCA(new BigDecimal("80.00"), "Aula de dança de 1 hora"),
    AULA_DE_NATACAO(new BigDecimal("100.00"), "Aula de natação de 1 hora");

    private final BigDecimal preco;
    private final String descricao;

    ServicosExtras(BigDecimal preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
