package com.pdz.comportamentais.mediator;

import java.util.Objects;

public class ClassificacaoEntrega {

    private final TipoEntrega tipoEntrega;
    private final TipoLocalizacao tipoLocalizacao;

    public ClassificacaoEntrega(TipoEntrega tipoEntrega, TipoLocalizacao tipoLocalizacao) {
        this.tipoEntrega = tipoEntrega;
        this.tipoLocalizacao = tipoLocalizacao;
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public TipoLocalizacao getTipoLocalizacao() {
        return tipoLocalizacao;
    }

    @Override
    public String toString() {
        return "ClassificacaoEntrega{" +
                "tipoEntrega=" + tipoEntrega +
                ", tipoLocalizacao=" + tipoLocalizacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassificacaoEntrega that = (ClassificacaoEntrega) o;
        return tipoEntrega == that.tipoEntrega && tipoLocalizacao == that.tipoLocalizacao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoEntrega, tipoLocalizacao);
    }
}
