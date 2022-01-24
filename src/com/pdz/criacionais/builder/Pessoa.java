package com.pdz.criacionais.builder;

public class Pessoa {

    private final String nome;
    private final String telefone;
    private final String cpf;
    private final String rua;
    private final String bairro;
    private final String numeroResidencial;

    public Pessoa(String nome, String telefone, String cpf, String rua, String bairro, String numeroResidencial) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.numeroResidencial = numeroResidencial;
    }

    private Pessoa(PessoaBuilder builder){
        this.nome = builder.nome;
        this.telefone = builder.telefone;
        this.cpf = builder.cpf;
        this.rua = builder.rua;
        this.bairro = builder.bairro;
        this.numeroResidencial = builder.numeroResidencial;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getNumeroResidencial() {
        return numeroResidencial;
    }

    public static class PessoaBuilder{
        private String nome;
        private String telefone;
        private String cpf;
        private String rua;
        private String bairro;
        private String numeroResidencial;

        PessoaBuilder() {
        }

        public PessoaBuilder comNome(String nome){
            this.nome = nome;
            return this;
        }

        public PessoaBuilder comTelefone(String telefone){
            this.telefone = telefone;
            return this;
        }

        public PessoaBuilder comCpf(String cpf){
            this.cpf = cpf;
            return this;
        }

        public PessoaBuilder comRua(String rua){
            this.rua = rua;
            return this;
        }

        public PessoaBuilder comBairro(String bairro){
            this.bairro = bairro;
            return this;
        }

        public PessoaBuilder comNumeroResidencial(String numeroResidencial){
            this.numeroResidencial = numeroResidencial;
            return this;
        }

        public Pessoa construir(){
            return new Pessoa(this);
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numeroResidencial='" + numeroResidencial + '\'' +
                '}';
    }
}
