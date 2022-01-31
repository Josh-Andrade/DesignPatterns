package com.pdz.comportamentais.strategy;

public class Passagem {

    private Transporte transporte;
    private String localPartida;
    private String localDestino;

    public Passagem(Transporte transporte, String localPartida, String localDestino) {
        this.transporte = transporte;
        this.localPartida = localPartida;
        this.localDestino = localDestino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
}
