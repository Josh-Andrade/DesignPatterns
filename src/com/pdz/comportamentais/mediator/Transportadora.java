package com.pdz.comportamentais.mediator;

import java.util.ArrayList;
import java.util.List;

public class Transportadora {

    private final List<Pedido> pedidos = new ArrayList<>();

    public void realizarPedido(Pedido pedido){
        pedido.setTransporte(Logistica.selecionarMelhorTransporte(pedido.getClassificacaoEntrega()));
        this.pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
