package com.pdz.criacionais.abstractfactory;

public class Caminhao implements Transporte {
    @Override
    public void mostrarTransporte() {
        System.out.println("Caminhão");
    }
}
