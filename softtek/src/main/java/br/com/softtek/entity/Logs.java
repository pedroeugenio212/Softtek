package br.com.softtek.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    private int id;
    private Chamado chamado;
    private Analista analista;
    private LocalDateTime data;
    private String descricao;

    public Logs() {}

    public Logs(int id, Chamado chamado, Analista analista, LocalDateTime data, String descricao) {
        this.id = id;
        this.chamado = chamado;
        this.analista = analista;
        this.data = data;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public Logs setId(int id) {
        this.id = id;
        return this;
    }

    public Chamado getChamado() {
        if(chamado == null)
            chamado = new Chamado();
        return chamado;
    }

    public Logs setChamado(Chamado chamado) {
        this.chamado = chamado;
        return this;
    }

    public Analista getAnalista() {
        if(analista == null)
            analista = new Analista();
        return analista;
    }

    public Logs setAnalista(Analista analista) {
        this.analista = analista;
        return this;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Logs setData(LocalDateTime data) {
        this.data = data;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Logs setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
    
    public static void exibirLogs(List<Logs> logs, Chamado chamado) {
        List<Logs> chamadoLogs = new ArrayList<>();
        System.out.println("\nLogs: ");
        for(Logs log : logs) {
            if(log.getChamado().getId() == chamado.getId())
                chamadoLogs.add(log);
        }
        for(Logs log : chamadoLogs) {
            System.out.println("\n" + log.getData().format(DateTimeFormatter.ofPattern("dd/MM")) + " - " + log.getDescricao());
        }
    }
}