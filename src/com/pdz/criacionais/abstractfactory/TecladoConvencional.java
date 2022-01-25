package com.pdz.criacionais.abstractfactory;

public class TecladoConvencional implements Perifericos{
    @Override
    public void mostrarNomePeriferico() {
        System.out.println("Teclado Convencional");
    }

    @Override
    public void acao() {
        System.out.println("Ligar");
    }
}
