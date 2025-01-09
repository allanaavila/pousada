package com.pousadasolnascente.model.enums;

public enum SituacaoReserva {
    AGUARDANDO_PAGAMENTO("Aguardando pagamento"),
    CONFIRMADO("Confirmado"),
    CANCELADO("Cancelado"),
    REEMBOLSADO("Reembolsado"),
    CHECKIN_DISPONIVEL("Disponível para Check-in"),
    OCUPADO("Ocupado"),
    EXPIRADO("Tempo de reserva expirado"),
    PAGO("Reserva inteiramente paga"),
    DESISTENCIA("Cliente não compareceu"),
    CHECKOUT_DISPONIVEL("Disponível para Check-out");

    private final String descricao;

    SituacaoReserva(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
