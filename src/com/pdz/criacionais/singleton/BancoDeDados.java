package com.pdz.criacionais.singleton;

public class BancoDeDados {

    private static BancoDeDados instance;

    private int consultasRealizadas;

    private BancoDeDados(){
    }

    public static BancoDeDados getInstance(){
        instance = instance == null ? new BancoDeDados() : instance;
        return instance;
    }

    public void query(){
        System.out.println("Realizando consulta...");
        consultasRealizadas++;
    }

    public void countConsultasRealizadas(){
        System.out.print("Consultas Realizadas: " + consultasRealizadas);
    }
}
