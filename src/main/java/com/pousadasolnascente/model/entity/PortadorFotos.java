package com.pousadasolnascente.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;

import java.util.List;

@MappedSuperclass
public abstract class PortadorFotos {
    @OneToMany(cascade = CascadeType.ALL)
    private List<Foto> fotos;

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }
}
