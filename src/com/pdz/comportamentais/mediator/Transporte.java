package com.pdz.comportamentais.mediator;

public abstract class Transporte {

    private final ClassificacaoEntrega classificacaoEntrega;

    public Transporte(ClassificacaoEntrega classificacaoEntrega) {
        this.classificacaoEntrega = classificacaoEntrega;
    }

    public ClassificacaoEntrega getClassificacaoEntrega() {
        return classificacaoEntrega;
    }

}
