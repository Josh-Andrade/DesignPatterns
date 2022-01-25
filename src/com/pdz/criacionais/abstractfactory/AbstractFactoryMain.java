package com.pdz.criacionais.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        var factoryUm = PerifericosGamerFactory.getInstance();
        var mouseUm = factoryUm.getMouseGamer();
        var tecladoUm = factoryUm.getTecladoGamer();

        mouseUm.mostrarNomePeriferico();
        tecladoUm.mostrarNomePeriferico();


        var factoryDois = PerifericosConvencionaisFactory.getInstance();
        var mouseDois = factoryDois.getMouseConvencional();
        var tecladoDois = factoryDois.getTecladoConvencional();

        mouseDois.mostrarNomePeriferico();
        tecladoDois.mostrarNomePeriferico();
    }
}
