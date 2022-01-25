package com.pdz.criacionais.abstractfactory;

public class MouseGamer implements Perifericos{
    @Override
    public void mostrarNomePeriferico() {
        System.out.println("Mouse Gamer");
    }

    @Override
    public void acao() {
        System.out.println("Ligar RBG");
    }
}
