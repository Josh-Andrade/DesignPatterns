package com.pdz.criacionais.abstractfactory;

public class PerifericosConvencionaisFactory implements PerifericosFactory{

    private static PerifericosConvencionaisFactory instance;

    private PerifericosConvencionaisFactory(){

    }

    public static PerifericosConvencionaisFactory getInstance() {
        instance = instance == null ? new PerifericosConvencionaisFactory() : instance;
        return instance;
    }

    @Override
    public Perifericos getMouse() {
        return new MouseConvencional();
    }

    @Override
    public Perifericos getTeclado() {
        return new TecladoConvencional();
    }
}
