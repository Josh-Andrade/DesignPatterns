package com.pdz.criacionais.factorymethod;

public abstract class TransporteFactory {

    public Transporte getTransporte(){
        return this.criarTransporte();
    }

    public abstract Transporte criarTransporte();
}
