package com.pousadasolnascente.model.enums;

public enum TipoUsuario {
    CLIENTE("Cliente"),
    FUNCIONARIO("Funcionário"),
    GERENTE("Gerente");

    private final String descricao;

    TipoUsuario(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
