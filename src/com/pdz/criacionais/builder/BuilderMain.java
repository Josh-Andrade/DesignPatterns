package com.pdz.criacionais.builder;

public class BuilderMain {

    public static void main(String[] args) {
        var pessoa = new Pessoa.PessoaBuilder()
                .comNome("Joshua")
                .comTelefone("40028922")
                .comCpf("132.456.789-00")
                .comRua("Rua")
                .comBairro("Bairro")
                .comNumeroResidencial("155")
                .construir();
        System.out.println(pessoa.toString());
    }
}
