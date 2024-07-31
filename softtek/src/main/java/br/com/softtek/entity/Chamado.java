package br.com.softtek.entity;

import java.time.LocalDateTime;

public class Chamado {
    
    private int id;
    private String numero;
    private Tipo tipo;
    private Status status;
    private Prioridade prioridede;
    private String descricao;
    private LocalDateTime abertura;
    private LocalDateTime ultimaAtualizacao; 
    private Chamado chamado;
    private Categoria categoria;
    private Grupo grupo;
    private Analista analista;
    private Usuario usuario;
    
    
    
    public enum Tipo {
        
    }
    public enum Status {
        
    }
    public enum Prioridade {
        
    }
}
