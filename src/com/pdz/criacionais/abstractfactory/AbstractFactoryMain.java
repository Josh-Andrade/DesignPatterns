package com.pdz.criacionais.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        var factoryUm = PerifericosGamerFactory.getInstance();
        var mouseUm = factoryUm.getMouse();
        var tecladoUm = factoryUm.getTeclado();

        mouseUm.mostrarNomePeriferico();
        tecladoUm.mostrarNomePeriferico();


        var factoryDois = PerifericosConvencionaisFactory.getInstance();
        var mouseDois = factoryDois.getMouse();
        var tecladoDois = factoryDois.getTeclado();

        mouseDois.mostrarNomePeriferico();
        tecladoDois.mostrarNomePeriferico();
    }
}
