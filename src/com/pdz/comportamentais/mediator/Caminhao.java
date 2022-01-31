package com.pdz.comportamentais.mediator;

import static com.pdz.comportamentais.mediator.TipoEntrega.CONVENCIONAL;
import static com.pdz.comportamentais.mediator.TipoLocalizacao.ESTADUAL;

public class Caminhao extends Transporte {

    public Caminhao() {
        super(new ClassificacaoEntrega(CONVENCIONAL, ESTADUAL));
    }

    @Override
    public String toString() {
        return "Transportando pedido de caminhão";
    }
}
