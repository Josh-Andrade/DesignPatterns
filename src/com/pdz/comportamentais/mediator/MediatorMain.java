package com.pdz.comportamentais.mediator;

import static com.pdz.comportamentais.mediator.TipoEntrega.EXPRESSA;
import static com.pdz.comportamentais.mediator.TipoLocalizacao.ESTADUAL;
import static com.pdz.comportamentais.mediator.TipoLocalizacao.MUNICIPAL;

public class MediatorMain {

    public static void main(String[] args) {
        var cliente = new Cliente("Josh", "Rua das bananeiras, 333");
        var produto = new Produto("Geladeira", 1500.0);
        var pedido = new Pedido(produto, cliente, new ClassificacaoEntrega(EXPRESSA, MUNICIPAL));
        var transportadora = new Transportadora();

        transportadora.realizarPedido(pedido);

        var pedido1 = new Pedido(produto, cliente, new ClassificacaoEntrega(EXPRESSA, ESTADUAL));

        transportadora.realizarPedido(pedido1);
        transportadora.getPedidos().forEach(System.out::println);
    }
}
