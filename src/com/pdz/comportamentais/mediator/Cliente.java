package com.pdz.comportamentais.mediator;

public class Cliente {

    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
