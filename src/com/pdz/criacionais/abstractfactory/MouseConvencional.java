package com.pdz.criacionais.abstractfactory;

public class MouseConvencional implements Perifericos{
    @Override
    public void mostrarNomePeriferico() {
        System.out.println("Mouse Convencional");
    }

    @Override
    public void acao() {
        System.out.println("Ligar");
    }
}
