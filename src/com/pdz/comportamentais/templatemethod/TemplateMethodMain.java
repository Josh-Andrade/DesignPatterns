package com.pdz.comportamentais.templatemethod;

public class TemplateMethodMain {

    public static void main(String[] args) {
        var veiculoACombustao = new CarroACombustao();
        var veiculoEletrico = new CarroEletrico();

        veiculoACombustao.movimentar();
        veiculoEletrico.movimentar();

        veiculoEletrico.movimentar();
    }
}
