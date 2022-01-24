package com.pdz.criacionais.prototype;

public class ModeloSport extends Carro{

    public ModeloSport(Integer potencia, Double torque, String modelo) {
        super(potencia, torque, modelo);
    }

    @Override
    public Carro clone() {
        return new ModeloSport(this.getPotencia(), this.getTorque(), this.getModelo());
    }
}
