package com.pdz.comportamentais.mediator;

import static com.pdz.comportamentais.mediator.TipoEntrega.CONVENCIONAL;
import static com.pdz.comportamentais.mediator.TipoLocalizacao.MUNICIPAL;

public class Carro extends Transporte {

    public Carro() {
        super(new ClassificacaoEntrega(CONVENCIONAL, MUNICIPAL));
    }

    @Override
    public String toString() {
        return "Transportando pedido de carro";
    }
}
