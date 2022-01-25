package com.pdz.criacionais.abstractfactory;

public class TecladoFactory implements PerifericosFactory{

    private static TecladoFactory instance;

    private TecladoFactory(){

    }

    @Override
    public Perifericos criarPeriferico() {
        return new Teclado();
    }

    public static TecladoFactory getInstance(){
        instance = instance == null ? new TecladoFactory() : instance;
        return instance;
    }
}
