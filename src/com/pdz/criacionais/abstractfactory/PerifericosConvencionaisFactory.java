package com.pdz.criacionais.abstractfactory;

public class PerifericosConvencionaisFactory implements ConvencionalFactory{

    private static PerifericosConvencionaisFactory instance;

    private PerifericosConvencionaisFactory(){

    }

    public static PerifericosConvencionaisFactory getInstance() {
        instance = instance == null ? new PerifericosConvencionaisFactory() : instance;
        return instance;
    }

    @Override
    public MouseConvencional getMouseConvencional() {
        return new MouseConvencional();
    }

    @Override
    public TecladoConvencional getTecladoConvencional() {
        return new TecladoConvencional();
    }
}
