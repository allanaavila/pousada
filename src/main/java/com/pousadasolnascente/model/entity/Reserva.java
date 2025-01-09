package com.pousadasolnascente.model.entity;

import com.pousadasolnascente.model.enums.ServicosExtras;
import com.pousadasolnascente.model.enums.SituacaoReserva;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Quarto quarto;

    private LocalDateTime iniciarReserva;
    private LocalDateTime fimReserva;

    @Enumerated(EnumType.STRING)
    private SituacaoReserva situacaoReserva;

    @ElementCollection
    @CollectionTable(name = "reserva_servicos_extras", joinColumns = @JoinColumn(name = "reserva_id"))
    @MapKeyEnumerated(EnumType.STRING)
    @Column(name = "quantidade")
    private Map<ServicosExtras, Integer> servicosExtras;

    private BigDecimal valorTotal;

    @OneToOne(cascade = CascadeType.ALL)
    private Avaliacao avaliacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public LocalDateTime getIniciarReserva() {
        return iniciarReserva;
    }

    public void setIniciarReserva(LocalDateTime iniciarReserva) {
        this.iniciarReserva = iniciarReserva;
    }

    public LocalDateTime getFimReserva() {
        return fimReserva;
    }

    public void setFimReserva(LocalDateTime fimReserva) {
        this.fimReserva = fimReserva;
    }

    public SituacaoReserva getSituacaoReserva() {
        return situacaoReserva;
    }

    public void setSituacaoReserva(SituacaoReserva situacaoReserva) {
        this.situacaoReserva = situacaoReserva;
    }

    public Map<ServicosExtras, Integer> getServicosExtras() {
        return servicosExtras;
    }

    public void setServicosExtras(Map<ServicosExtras, Integer> servicosExtras) {
        this.servicosExtras = servicosExtras;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
}
