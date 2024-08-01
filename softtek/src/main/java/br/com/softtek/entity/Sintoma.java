package br.com.softtek.entity;

class Sintoma {
    private int id;
    private String nome;
    private String qualificacao;

    public Sintoma() {}

    public Sintoma(int id, String nome, String qualificacao) {
        this.id = id;
        this.nome = nome;
        this.qualificacao = qualificacao;
    }

    public int getId() {
        return id;
    }

    public Sintoma setId(int id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Sintoma setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getQualificacao() {
        return qualificacao;
    }

    public Sintoma setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
        return this;
    }
    
    
}
