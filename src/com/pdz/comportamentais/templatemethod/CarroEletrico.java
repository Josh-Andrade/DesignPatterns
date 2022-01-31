package com.pdz.comportamentais.templatemethod;

public class CarroEletrico extends Veiculo{
    @Override
    void engatarCambio() {
        System.out.println("Movendo cambio para Drive...");
    }

    @Override
    void ligarMotor() {
        System.out.println("Pressionando botão para dar partida");
    }
}
