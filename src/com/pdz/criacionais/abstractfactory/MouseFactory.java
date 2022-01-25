package com.pdz.criacionais.abstractfactory;

import com.pdz.criacionais.singleton.BancoDeDados;

public class MouseFactory implements PerifericosFactory{

    private static MouseFactory instance;

    private MouseFactory(){

    }

    @Override
    public Perifericos criarPeriferico() {
        return new Mouse();
    }

    public static MouseFactory getInstance(){
        instance = instance == null ? new MouseFactory() : instance;
        return instance;
    }
}
