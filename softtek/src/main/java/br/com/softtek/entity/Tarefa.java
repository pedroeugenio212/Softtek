package br.com.softtek.entity;

import java.time.LocalDateTime;

public class Tarefa {
    private int id;
    private Chamado chamado;
    private Analista analista;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataEncerramento;
    private String numero;
    private String descricao;
    private Status status;

    public Tarefa() {}

    public Tarefa(int id, Chamado chamado, Analista analista, LocalDateTime dataAbertura, LocalDateTime dataEncerramento, String numero, String descricao, Status status) {
        this.id = id;
        this.chamado = chamado;
        this.analista = analista;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = dataEncerramento;
        this.numero = numero;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Tarefa setId(int id) {
        this.id = id;
        return this;
    }

    public Chamado getChamado() {
        if(chamado == null)
            chamado = new Chamado();
        return chamado;
    }

    public Tarefa setChamado(Chamado chamado) {
        this.chamado = chamado;
        return this;
    }

    public Analista getAnalista() {
        if(analista == null)
            analista = new Analista();
        return analista;
    }

    public Tarefa setAnalista(Analista analista) {
        this.analista = analista;
        return this;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public Tarefa setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
        return this;
    }

    public LocalDateTime getDataEncerramento() {
        return dataEncerramento;
    }

    public Tarefa setDataEncerramento(LocalDateTime dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Tarefa setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Tarefa setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Tarefa setStatus(Status status) {
        this.status = status;
        return this;
    }
    
    
    public enum Status{
    
    }
}
