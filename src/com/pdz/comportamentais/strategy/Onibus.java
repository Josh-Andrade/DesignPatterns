package com.pdz.comportamentais.strategy;

public class Onibus implements Transporte{
    @Override
    public void mostrarTransporte() {
        System.out.println("Ônibus");
    }
}
