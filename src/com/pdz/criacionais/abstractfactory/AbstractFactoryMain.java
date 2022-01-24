package com.pdz.criacionais.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        TransporteFactory factoryUm = new CaminhaoFactory();
        var transporteUm = factoryUm.criarTransporte();
        transporteUm.mostrarTransporte();

        TransporteFactory factoryDois = new NavioFactory();
        var transporteDois = factoryDois.criarTransporte();
        transporteDois.mostrarTransporte();
    }
}
