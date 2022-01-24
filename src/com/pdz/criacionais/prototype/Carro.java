package com.pdz.criacionais.prototype;

public abstract class Carro {

    private Integer potencia;
    private Double torque;
    private String modelo;

    public Carro(Integer potencia, Double torque, String modelo) {
        this.potencia = potencia;
        this.torque = torque;
        this.modelo = modelo;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public Double getTorque() {
        return torque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public void setTorque(Double torque) {
        this.torque = torque;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract Carro clone();

    @Override
    public String toString() {
        return "Carro{" +
                "potencia=" + potencia +
                ", torque=" + torque +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
