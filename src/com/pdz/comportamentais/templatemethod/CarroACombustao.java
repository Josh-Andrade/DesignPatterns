package com.pdz.comportamentais.templatemethod;

public class CarroACombustao extends Veiculo{
    @Override
    void engatarCambio() {
        System.out.println("Pisando na embreagem e engatando cambio...");
    }

    @Override
    void ligarMotor() {
        System.out.println("Girando a chave para dar partida...");
    }

}
