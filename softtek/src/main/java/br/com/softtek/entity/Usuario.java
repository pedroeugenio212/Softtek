package br.com.softtek.entity;

class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String descricao;
    private String telefone;

    public Usuario() {}

    public Usuario(int id, String nome, String email, String senha, String descricao, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.descricao = descricao;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public Usuario setId(int id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Usuario setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Usuario setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }
}
