package br.com.softtek.entity;

import java.time.LocalDateTime;

public class Chamado {
    
    private int id;
    private String numero;
    private Tipo tipo;
    private Status status;
    private Prioridade prioridade;
    private String descricao;
    private LocalDateTime abertura;
    private LocalDateTime ultimaAtualizacao; 
    private Chamado chamado;
    private Categoria categoria;
    private Grupo grupo;
    private Analista analista;
    private Usuario usuario;

    public Chamado() {}

    public Chamado(int id, String numero, Tipo tipo, Status status, Prioridade prioridade,
            String descricao, LocalDateTime abertura, LocalDateTime ultimaAtualizacao,
            Chamado chamado, Categoria categoria, Grupo grupo, Analista analista, Usuario usuario) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
        this.prioridade = prioridade;
        this.descricao = descricao;
        this.abertura = abertura;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.chamado = chamado;
        this.categoria = categoria;
        this.grupo = grupo;
        this.analista = analista;
        this.usuario = usuario;
    }
    
    
    
    public int getId() {
        return id;
    }

    public Chamado setId(int id) {
        this.id = id;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Chamado setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Chamado setTipo(Tipo tipo) {
        this.tipo = tipo;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Chamado setStatus(Status status) {
        this.status = status;
        return this;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Chamado setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Chamado setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public LocalDateTime getAbertura() {
        return abertura;
    }

    public Chamado setAbertura(LocalDateTime abertura) {
        this.abertura = abertura;
        return this;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public Chamado setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
        return this;
    }

    public Chamado getChamado() {
        if(chamado == null)
            chamado =  new Chamado();
        return chamado;
    }

    public Chamado setChamado(Chamado chamado) {
        this.chamado = chamado;
        return this;
    }

    public Categoria getCategoria() {
        if(categoria == null)
            categoria =  new Categoria();
        return categoria;
    }

    public Chamado setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    public Grupo getGrupo() {
        if(grupo == null)
            grupo =  new Grupo();
        return grupo;
    }

    public Chamado setGrupo(Grupo grupo) {
        this.grupo = grupo;
        return this;
    }

    public Analista getAnalista() {
        if(analista == null)
            analista =  new Analista();
        return analista;
    }

    public Chamado setAnalista(Analista analista) {
        this.analista = analista;
        return this;
    }

    public Usuario getUsuario() {
        if(usuario == null)
            usuario =  new Usuario();
        return usuario;
    }

    public Chamado setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }
    
    
    public enum Tipo {
        INCIDENTE,
        MUDANCA,
        PROBLEMA,
        REQUISICAO
        
    }
    public enum Status {
        ABERTO,
        ATRIBUIDO,
        EM_ESPERA,
        RESOLVIDO
        
    }
    public enum Prioridade {
        
    }
}
