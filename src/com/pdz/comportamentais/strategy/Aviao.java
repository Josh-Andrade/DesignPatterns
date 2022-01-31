package com.pdz.comportamentais.strategy;

public class Aviao implements Transporte{
    @Override
    public void mostrarTransporte() {
        System.out.println("Avião");
    }
}
