package com.pousadasolnascente.model.entity;

import com.pousadasolnascente.model.enums.Comodidades;
import com.pousadasolnascente.model.enums.TipoQuarto;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Quarto extends PortadorFotos{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoQuarto tipoQuarto;

    private BigDecimal diaria;

    @ElementCollection
    @CollectionTable(name = "quarto_comodidades", joinColumns = @JoinColumn(name = "quarto_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "comodidade")
    private List<Comodidades> comodidades;

    @OneToMany(mappedBy = "quarto", cascade = CascadeType.ALL)
    private List<Avaliacao> avaliacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public BigDecimal getDiaria() {
        return diaria;
    }

    public void setDiaria(BigDecimal diaria) {
        this.diaria = diaria;
    }

    public List<Comodidades> getComodidades() {
        return comodidades;
    }

    public void setComodidades(List<Comodidades> comodidades) {
        this.comodidades = comodidades;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
