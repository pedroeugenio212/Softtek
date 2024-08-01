package br.com.softtek.entity;

class Analista {
    private int id;
    private Grupo grupo;
    private String nome;
    private String email;
    private br.com.softtek.entity.Analista.Categoria categoria;

    public Analista() {}

    public Analista(int id, Grupo grupo, String nome, String email, Categoria categoria) {
        this.id = id;
        this.grupo = grupo;
        this.nome = nome;
        this.email = email;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public Analista setId(int id) {
        this.id = id;
        return this;
    }

    public Grupo getGrupo() {
        if(grupo == null)
            grupo = new Grupo();
        return grupo;
    }

    public Analista setGrupo(Grupo grupo) {
        this.grupo = grupo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Analista setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Analista setEmail(String email) {
        this.email = email;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Analista setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }
    
    public enum Categoria {
    
    }
    
}
