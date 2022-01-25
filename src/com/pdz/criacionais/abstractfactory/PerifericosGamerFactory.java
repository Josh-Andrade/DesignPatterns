package com.pdz.criacionais.abstractfactory;

public class PerifericosGamerFactory implements PerifericosFactory{

    private static PerifericosGamerFactory instance;

    private PerifericosGamerFactory(){

    }

    public static PerifericosGamerFactory getInstance() {
        instance = instance == null ? new PerifericosGamerFactory() : instance;
        return instance;
    }

    @Override
    public Perifericos getMouse() {
        return new MouseGamer();
    }

    @Override
    public Perifericos getTeclado() {
        return new TecladoGamer();
    }
}
