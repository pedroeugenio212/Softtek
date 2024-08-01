package br.com.softtek.entity;

public class Local {
    private int id;
    private String nome;
    private String complemento;

    public Local() {}

    public Local(int id, String nome, String complemento) {
        this.id = id;
        this.nome = nome;
        this.complemento = complemento;
    }

    public int getId() {
        return id;
    }

    public Local setId(int id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Local setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public Local setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }
    
}