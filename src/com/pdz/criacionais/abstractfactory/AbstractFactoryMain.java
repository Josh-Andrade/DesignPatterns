package com.pdz.criacionais.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        PerifericosFactory factoryUm = MouseFactory.getInstance();
        var periferico = factoryUm.criarPeriferico();
        periferico.mostrarNomePeriferico();

        PerifericosFactory factoryDois = TecladoFactory.getInstance();
        var transporteDois = factoryDois.criarPeriferico();
        transporteDois.mostrarNomePeriferico();
    }
}
