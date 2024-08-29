package br.com.softtek.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class Chamado {
    
    private int id;
    private String numero;
    private Tipo tipo;
    private Status status;
    private Prioridade prioridade;
    private String descricao;
    private LocalDateTime abertura;
    private LocalDateTime encerramento;
    private LocalDateTime ultimaAtualizacao;
    private Categoria categoria;
    private Grupo grupo;
    private Analista analista;
    private Usuario usuario;

    public Chamado() {}

    public Chamado(int id, String numero, Tipo tipo, Status status, Prioridade prioridade,
            String descricao, LocalDateTime abertura, LocalDateTime ultimaAtualizacao,
            Categoria categoria, Grupo grupo, Analista analista, Usuario usuario) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
        this.prioridade = prioridade;
        this.descricao = descricao;
        this.abertura = abertura;
        this.ultimaAtualizacao = ultimaAtualizacao;
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
    
    public LocalDateTime getEncerramento() {
        return encerramento;
    }

    public Chamado setEncerramento(LocalDateTime encerramento) {
        this.encerramento = encerramento;
        return this;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public Chamado setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
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
        REQUISICAO;

        @Override
        public String toString() {
        String name = name().toLowerCase(); 
        return Character.toUpperCase(name.charAt(0)) + name.substring(1).replace('_', ' ');
        }
    }
    
    public enum Status {
        ABERTO,
        ATRIBUIDO,
        EM_ESPERA,
        RESOLVIDO;

        @Override
        public String toString() {
        String name = name().toLowerCase(); 
        return Character.toUpperCase(name.charAt(0)) + name.substring(1).replace('_', ' ');
        }
        
    }
    
    public enum Prioridade {
        ALTO,
        MEDIO,
        BAIXO,
        PLANEJAMENTO;

        @Override
        public String toString() {
        String name = name().toLowerCase(); 
        return Character.toUpperCase(name.charAt(0)) + name.substring(1).replace('_', ' ');
        }
    }
    
    public static void situacaoChamado(List<Chamado> totalChamados){
        int aberto = 0;
        int atribuido = 0;
        int emEspera = 0;
        int resolvido = 0;
        
        for(Chamado chamado : totalChamados) {
            switch (chamado.getStatus()) {
                case ABERTO -> aberto += 1;
                case ATRIBUIDO -> atribuido += 1;
                case EM_ESPERA -> emEspera += 1;
                case RESOLVIDO -> resolvido += 1;
                default -> System.out.println("Status inválido");
            }
        }
        System.out.println("\n- Situação dos Chamados - \nAbertos: " + aberto +
                "\nAtribuídos: " + atribuido +
                "\nEm Espera: " + emEspera +
                "\nResolvidos: " + resolvido);
    }
    
    public static void listarChamados(List<Chamado> totalChamados){
        
        int i = 1;
        for(Chamado chamado : totalChamados) {
            System.out.println("\n" + i + ")\nNúmero: " + chamado.getNumero() +
                    "\nTipo: " + chamado.getTipo().toString() +
                    "\nDescrição: " + chamado.getDescricao() +
                    "\nStatus: " + chamado.getStatus().toString() +
                    "\nAtribuído: " + chamado.getAnalista().getNome() +
                    "\nAberto em: " + chamado.getAbertura().format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy, HH:mm", new Locale("pt", "BR"))) 
            );
            i += 1;
        }
    }
    
    public static void informacoesChamado(Chamado chamado) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy, HH:mm", new Locale("pt", "BR"));
    String solucao = "Verificar os logs do sistema em busca de erros ou avisos que possam indicar a causa do problema.";

    String dataEncerramento = (chamado.getEncerramento() != null) ? chamado.getEncerramento().format(formatter) : "Não encerrado";

    System.out.println("Data de abertura: " + chamado.getAbertura().format(formatter) +
            "\nDescrição: " + chamado.getDescricao() +
            "\nSintoma: " + chamado.getCategoria().getSintoma().getNome() +
            "\nQualificação de sintoma: " + chamado.getCategoria().getSintoma().getQualificacao() +
            "\nData de encerramento: " + dataEncerramento +
            "\nDados do usuário: \n Nome: " + chamado.getUsuario().getNome() +
            "\n Telefone: " + chamado.getUsuario().getTelefone() +
            "\n Email: " + chamado.getUsuario().getEmail() +
            "\nStatus: " + chamado.getStatus().toString() +
            "\nTipo: " + chamado.getTipo().toString() +
            "\nCategoria: " + chamado.getCategoria().getTipo().toString() +
            "\nSubcategoria: " + chamado.getCategoria().getSubTipo().toString() +
            "\nSolução sugerida: " + solucao);
    }

}
