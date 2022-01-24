package com.pdz.criacionais.abstractfactory;

public class NavioFactory implements TransporteFactory{

    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}
