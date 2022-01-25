package com.pdz.criacionais.abstractfactory;

public class TecladoGamer implements Perifericos{
    @Override
    public void mostrarNomePeriferico() {
        System.out.println("Teclado Gamer");
    }

    @Override
    public void acao() {
        System.out.println("Ligar RBG");
    }
}
