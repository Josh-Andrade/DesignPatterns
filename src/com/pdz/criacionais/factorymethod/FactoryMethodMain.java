package com.pdz.criacionais.factorymethod;

public class FactoryMethodMain {

    public static void main(String[] args) {
        var factoryUm = CaminhaoFactory.getInstance();
        var transporteUm = factoryUm.getTransporte();
        transporteUm.mostrarTransporte();

        var factoryDois = NavioFactory.getInstance();
        var transporteDois = factoryDois.getTransporte();
        transporteDois.mostrarTransporte();
    }
}
