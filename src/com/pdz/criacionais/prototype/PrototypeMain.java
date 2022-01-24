package com.pdz.criacionais.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        var modeloSportUm = new ModeloSport(255, 36.7, "BMW 320i");
        var modeloSportDois = modeloSportUm.clone();

        modeloSportDois.setPotencia(355);

        System.out.println("Modelo um: " + modeloSportUm);
        System.out.println("Modelo dois: " + modeloSportDois);
    }
}
