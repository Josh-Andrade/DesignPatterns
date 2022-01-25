package com.pdz.criacionais.abstractfactory;

public class PerifericosGamerFactory implements GamerFactory{

    private static PerifericosGamerFactory instance;

    private PerifericosGamerFactory(){

    }

    public static PerifericosGamerFactory getInstance() {
        instance = instance == null ? new PerifericosGamerFactory() : instance;
        return instance;
    }

    @Override
    public MouseGamer getMouseGamer() {
        return new MouseGamer();
    }

    @Override
    public TecladoGamer getTecladoGamer() {
        return new TecladoGamer();
    }
}
