package com.pdz.criacionais.factorymethod;

public class NavioFactory extends TransporteFactory{

    private static NavioFactory instance;

    private NavioFactory(){

    }

    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }

    public static NavioFactory getInstance(){
        instance = instance == null ? new NavioFactory() : instance;
        return instance;
    }
}
