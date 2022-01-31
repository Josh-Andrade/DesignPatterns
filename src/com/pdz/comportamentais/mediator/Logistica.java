package com.pdz.comportamentais.mediator;

import java.util.List;

public class Logistica {

    private static List<Transporte> transportes = List.of(new Carro(), new Caminhao(), new Aviao(), new Moto());

    public static Transporte selecionarMelhorTransporte(ClassificacaoEntrega classificacaoEntrega){
        return transportes
                .stream()
                .filter(transporte -> transporte.getClassificacaoEntrega().equals(classificacaoEntrega))
                .findFirst()
                .orElse(null);
    }
}
