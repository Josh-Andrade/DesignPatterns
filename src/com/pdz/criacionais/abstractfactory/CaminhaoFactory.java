package com.pdz.criacionais.abstractfactory;

public class CaminhaoFactory implements TransporteFactory{
    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}
