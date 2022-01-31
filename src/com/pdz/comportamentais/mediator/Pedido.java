package com.pdz.comportamentais.mediator;

public class Pedido {
    private final Produto produto;
    private final Cliente cliente;
    private final ClassificacaoEntrega classificacaoEntrega;
    private Transporte transporte;

    public Pedido(Produto produto, Cliente cliente, ClassificacaoEntrega classificacaoEntrega) {
        this.produto = produto;
        this.cliente = cliente;
        this.classificacaoEntrega = classificacaoEntrega;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public ClassificacaoEntrega getClassificacaoEntrega() {
        return classificacaoEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "produto=" + produto +
                ", cliente=" + cliente +
                ", classificacaoEntrega=" + classificacaoEntrega +
                ", transporte=" + transporte +
                '}';
    }
}
