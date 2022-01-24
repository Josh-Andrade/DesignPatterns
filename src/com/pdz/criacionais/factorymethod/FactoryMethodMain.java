package com.pdz.criacionais.factorymethod;

import static com.pdz.criacionais.factorymethod.TipoTransporte.MARITIMO;
import static com.pdz.criacionais.factorymethod.TipoTransporte.RODOVIARIO;

public class FactoryMethodMain {

    public static void main(String[] args) {
        var transporteUm = TransporteFactory.criarTransporte(MARITIMO);
        transporteUm.mostrarTransporte();

        var transporteDois = TransporteFactory.criarTransporte(RODOVIARIO);
        transporteDois.mostrarTransporte();
    }
}
