package com.pdz.criacionais.factorymethod;

public class CaminhaoFactory extends TransporteFactory{

    private static CaminhaoFactory instance;

    private CaminhaoFactory(){

    }

    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }

    public static CaminhaoFactory getInstance(){
        instance = instance == null ? new CaminhaoFactory() : instance;
        return instance;
    }
}
