package com.pdz.comportamentais.mediator;

import static com.pdz.comportamentais.mediator.TipoEntrega.EXPRESSA;
import static com.pdz.comportamentais.mediator.TipoLocalizacao.ESTADUAL;

public class Aviao extends Transporte {

    public Aviao() {
        super(new ClassificacaoEntrega(EXPRESSA, ESTADUAL));
    }

    @Override
    public String toString() {
        return "Transportando pedido de avião";
    }
}
