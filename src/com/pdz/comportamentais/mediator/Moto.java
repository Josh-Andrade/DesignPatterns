package com.pdz.comportamentais.mediator;

import static com.pdz.comportamentais.mediator.TipoEntrega.EXPRESSA;
import static com.pdz.comportamentais.mediator.TipoLocalizacao.MUNICIPAL;

public class Moto extends Transporte {

    public Moto() {
        super(new ClassificacaoEntrega(EXPRESSA, MUNICIPAL));
    }

    @Override
    public String toString() {
        return "Transportando pedido de moto";
    }
}
