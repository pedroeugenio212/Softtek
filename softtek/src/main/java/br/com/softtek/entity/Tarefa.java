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
    
    
    
    public enum Status{
    
    }
}
