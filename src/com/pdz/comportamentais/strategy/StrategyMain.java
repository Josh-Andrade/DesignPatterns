package com.pdz.comportamentais.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        var transporte1 = new Aviao();
        var transporte2 = new Onibus();
        var passagem = new Passagem(transporte1, "Maceió", "São paulo");

        passagem.getTransporte().mostrarTransporte();

        passagem.setTransporte(transporte2);
        passagem.getTransporte().mostrarTransporte();

    }
}
