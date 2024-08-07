package br.com.softtek.entity;

import java.time.LocalDateTime;

public class Resolvido {
    private Chamado chamado;
    private LocalDateTime dataFechamento;
    private String descricao;

    public Resolvido () {}

    public Resolvido (Chamado chamado, LocalDateTime dataFechamento, String descricao) {
        this.chamado = chamado;
        this.dataFechamento = dataFechamento;
        this.descricao = descricao;
    }

    public Chamado getChamado() {
        return chamado;
    }

    public Resolvido setChamado(Chamado chamado) {
        this.chamado = chamado;
        return this;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public Resolvido setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Resolvido setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

}
