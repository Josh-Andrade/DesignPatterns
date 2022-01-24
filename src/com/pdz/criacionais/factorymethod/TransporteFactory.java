package com.pdz.criacionais.factorymethod;

public class TransporteFactory {

    public static Transporte criarTransporte(TipoTransporte tipoTransporte){
        return switch (tipoTransporte){
            case RODOVIARIO ->  new Caminhao();
            case MARITIMO -> new Navio();
        };
    }
}
