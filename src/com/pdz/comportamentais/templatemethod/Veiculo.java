package com.pdz.comportamentais.templatemethod;

public abstract class Veiculo {

    private boolean motorLigado;
    private boolean cambioEngatado;

    public void movimentar(){
        if (!motorLigado) {
            ligarMotor();
        }
        if (cambioEngatado){
            System.out.println("Acelerando veiculo...");
        } else{
            engatarCambio();
            System.out.println("Acelerando veiculo...");
        }
    }

    abstract void engatarCambio();

    abstract void ligarMotor();

}
