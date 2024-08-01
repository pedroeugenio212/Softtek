package br.com.softtek.entity;

class Categoria {
    private int id;
    private Sintoma sintoma;
    private Tipo tipo;
    private SubTipo subTipo;

    public Categoria() {}
    
    public Categoria(int id, Sintoma sintoma, Tipo tipo, SubTipo subTipo) {
        this.id = id;
        this.sintoma = sintoma;
        this.tipo = tipo;
        this.subTipo = subTipo;
    }
    
    public int getId() {
        return id;
    }

    public Categoria setId(int id) {
        this.id = id;
        return this;
    }

    public Sintoma getSintoma() {
        return sintoma;
    }

    public Categoria setSintoma(Sintoma sintoma) {
        this.sintoma = sintoma;
        return this;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Categoria setTipo(Tipo tipo) {
        this.tipo = tipo;
        return this;
    }

    public SubTipo getSubTipo() {
        return subTipo;
    }

    public Categoria setSubTipo(SubTipo subTipo) {
        this.subTipo = subTipo;
        return this;
    }

    
    public enum Tipo {
        OUTROS_SISTEMAS,
        ACESSOS,
        FUNCIONAL_SAP,
        EQUIPAMENTO_TI,
        SISTEMAS,
        OUTRAS_SOLICITACOES
    }
    public enum SubTipo {
        ADAPT,
        SISTEMA_LABWARE,
        HCA,
        LAKOS,
        OUTROS_SISTEMAS,
        ALTERACAO_PERFIL,
        LIBERACAO_ACESSO,
        SOLICITACAO,
        TROCA_EQUIPAMENTO
    }
}
