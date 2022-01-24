package com.pdz.criacionais.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        var bancoDeDadosUm = BancoDeDados.getInstance();
        bancoDeDadosUm.query();
        bancoDeDadosUm.query();

        var bancoDeDadosDois = BancoDeDados.getInstance();

        bancoDeDadosDois.countConsultasRealizadas();
    }
}
