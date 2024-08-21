package br.com.softtek;

import br.com.softtek.entity.Analista;
import br.com.softtek.entity.Categoria;
import br.com.softtek.entity.Chamado;
import br.com.softtek.entity.Grupo;
import br.com.softtek.entity.Local;
import br.com.softtek.entity.Logs;
import br.com.softtek.entity.Sintoma;
import br.com.softtek.entity.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utilitario {
    
    Scanner sc = new Scanner(System.in);
    Analista analista1 = new Analista();
    Analista analista2 = new Analista();
    Analista analista3 = new Analista();
    Analista analista4 = new Analista();
    Categoria categoria1 = new Categoria();
    Categoria categoria2 = new Categoria();
    Categoria categoria3 = new Categoria();
    Chamado chamado1 = new Chamado();
    Chamado chamado2 = new Chamado();
    Grupo grupo1 = new Grupo();
    Grupo grupo2 = new Grupo();
    Local local1 = new Local();
    Local local2 = new Local();
    Logs logs1 = new Logs();
    Logs logs2 = new Logs();
    Sintoma sintoma1 = new Sintoma();
    Sintoma sintoma2 = new Sintoma();
    Usuario usuario1 = new Usuario();
    Usuario usuario2 = new Usuario();
    
    List<Chamado> totalChamados = new ArrayList<>();
    List<Logs> totalLogs = new ArrayList<>();

    public void Instanciar() {
        analista1
            .setId(1)
            .setGrupo(grupo1)
            .setNome("Ricardo Almeida Pires")
            .setEmail("teste")
            .setCategoria(Analista.Categoria.ACESSO);
        analista2
            .setId(2)
            .setGrupo(grupo2)
            .setNome("Amanda Rocha Nascimento")
            .setEmail("Amanda.Rocha@sofftekHP.com.br")
            .setCategoria(Analista.Categoria.AMS);
        analista3
            .setId(3)
            .setGrupo(grupo2)
            .setNome("Rafael Pereira")
            .setEmail("Rafael.Pereira@sofftekHP.com.br")
            .setCategoria(Analista.Categoria.FIELD);
        analista4
            .setId(4)
            .setGrupo(grupo1)
            .setNome("Mariana Alves Campos")
            .setEmail("Mariana.Alves@sofftekHP.com.br")
            .setCategoria(Analista.Categoria.SERVICE_DESK);  
        categoria1
            .setId(1)
            .setSintoma(sintoma1)  
            .setTipo(Categoria.Tipo.ACESSOS)
            .setSubTipo(Categoria.SubTipo.ADAPT);
        categoria2
            .setId(2)
            .setSintoma(sintoma2)  
            .setTipo(Categoria.Tipo.EQUIPAMENTO_TI)
            .setSubTipo(Categoria.SubTipo.TROCA_EQUIPAMENTO);
        categoria3
            .setId(3)
            .setSintoma(sintoma1)  
            .setTipo(Categoria.Tipo.OUTROS_SISTEMAS)
            .setSubTipo(Categoria.SubTipo.LIBERACAO_ACESSO);

        chamado1
            .setId(1)
            .setCategoria(categoria1)
            .setGrupo(grupo2)
            .setAnalista(analista2)
            .setUsuario(usuario1)
            .setNumero("67789001")
            .setTipo(Chamado.Tipo.PROBLEMA)
            .setStatus(Chamado.Status.ABERTO)
            .setPrioridade(Chamado.Prioridade.ALTO)
            .setDescricao("Problema referente ao ....")
            .setAbertura(LocalDateTime.of(2024, 7, 21, 10, 42, 36))
            .setUltimaAtualizacao(LocalDateTime.of(2024, 7, 21, 16, 07, 28));
        chamado2
            .setId(2)
            .setCategoria(categoria2)
            .setGrupo(grupo1)
            .setAnalista(analista4)
            .setUsuario(usuario2)
            .setNumero("67789002")
            .setTipo(Chamado.Tipo.PROBLEMA)
            .setStatus(Chamado.Status.RESOLVIDO)
            .setPrioridade(Chamado.Prioridade.ALTO)
            .setDescricao("Problema referente ao ....")
            .setAbertura(LocalDateTime.of(2024, 7, 28, 8, 19, 06))
            .setUltimaAtualizacao(LocalDateTime.of(2024, 7, 11, 13, 16, 57));
        grupo1
            .setId(1)
            .setNome("Dano");
        grupo2
            .setId(2)
            .setNome("Analise");
        local1
            .setId(1)
            .setNome("Escritório Rio de Janeiro")
            .setComplemento("Sala 34, 3° Andar");
        local2
            .setId(2)
            .setNome("Sala de reuniões - Guarulhos")
            .setComplemento("Sala 101, 11° Andar");
        logs1
            .setId(1)
            .setChamado(chamado1)
            .setAnalista(analista3)
            .setData(LocalDateTime.of(2024, 7, 21, 11, 50, 07))
            .setDescricao("O equipamento está passando por uma atualização.");
        logs2
            .setId(2)
            .setChamado(chamado2)
            .setAnalista(analista1)
            .setData(LocalDateTime.of(2024, 7, 28, 9, 10, 44))
            .setDescricao("Aguardando o retorno da equipe de campo.");
        sintoma1
            .setId(1)
            .setNome("Mal funcionamento do equipamento")
            .setQualificacao("Qualificação");
        sintoma2
            .setId(2)
            .setNome("Problemas na tela")
            .setQualificacao("Qualificação");
        usuario1
            .setId(1)
            .setNome("Roberto Almeida Santos")
            .setEmail("testeusuario")
            .setSenha("123456")
            .setDescricao("Descrição usuário 1")
            .setTelefone("(11) 97879 - 9901");
        usuario2
            .setId(2)
            .setNome("Ana Maria de Souza")
            .setEmail("ana@email.com")
            .setSenha("ABC123")
            .setDescricao("Descrição usuário 2")
            .setTelefone("(21) 98871 - 5241");
        
        totalChamados.add(chamado1);
        totalChamados.add(chamado2);
        
        totalLogs.add(logs1);
        totalLogs.add(logs2);
        
    }

    public void loginUsuario() {

        boolean acesso = false;

        String acesso_emailUsuario[] = {usuario1.getEmail(), usuario2.getEmail()};
        String acesso_senha[] = {usuario1.getSenha(), usuario2.getSenha()};
            
        System.out.println("\nAcessando como Usuário.\n");

        do {

            System.out.print("Insira o e-mail: ");
            String email = sc.next();
            System.out.print("Insira a senha: ");
            String senha = sc.next();

            for (int i = 0; i < acesso_emailUsuario.length; i++) {
                if (email.equals(acesso_emailUsuario[i]) && senha.equals(acesso_senha[i])) {
                    acesso = true;
                    break;
                } else {
                    System.out.println("\nUsuário não encontrado! Tente novamente\n");
                    break;
                }
            }
        } while (!acesso); 
    }

    public void loginAnalista() {
        boolean acesso = false;

        String acesso_email[] = {analista1.getEmail(), analista2.getEmail(), analista3.getEmail(), analista4.getEmail()};
        String acesso_grupo[] = {analista1.getGrupo().getNome(), analista2.getGrupo().getNome(), analista3.getGrupo().getNome(), analista4.getGrupo().getNome()};

        System.out.println("\nAcessando como Analista.\n");

        do {
            System.out.print("Insira o e-mail: ");
            String email = sc.next();
            System.out.print("Insira o nome do seu grupo: ");
            String grupo = sc.next();

            for (int i = 0; i < acesso_email.length; i++) {
                if (email.equals(acesso_email[i]) && grupo.equals(acesso_grupo[i])) {
                    acesso = true;
                    break;
                } else {
                    System.out.println("\nAnalista não encontrado. Tente novamente!\n");
                    break;
                }
            } 
        } while (!acesso);
    }

    public int menuUsuario() {
        System.out.println("\n Acessando como Usuário... \n");
        System.out.println("\n\n ------------------- Bem vindo a Softtek Help Center ------------------- \n");
        System.out.println("Selecione uma das opções a seguir: "); 
        // Colocar as opções das funcionalidades de cada acesso aqui
        System.out.println("1 ---- Funcionalidade 1");
        System.out.println("2 ---- Funcionalidade 2");
        System.out.print("\nDigite: ");
        int op = sc.nextInt();
        return op;
    }

    public int menuAnalista() {
        System.out.println("\n Acessando como Analista... \n");
        System.out.println("\n\n ------------------- Bem vindo a Softtek Help Center ------------------- \n");
        // Colocar as opções das funcionalidades de cada acesso aqui
        System.out.println("Selecione uma das opções a seguir: "); 
        System.out.println("1 ---- Exibir Dashboard");
        System.out.println("2 ---- Detalhes do Chamado");
        System.out.print("\nDigite: ");
        int op = sc.nextInt();
        return op;
    }

    public void limparEntradaInvalida()
    {
        if (sc.hasNext())
            sc.next();
    }

    public void exibirDashboard() {
        System.out.println("\n\n ------------------- Softtek Help Center - Dashboard ------------------- \n");
        Chamado.situacaoChamado(totalChamados);
        Chamado.listarChamados(totalChamados);
    }
    
    public void detalhesChamado() {
        System.out.println("\n\n ------------------- Softtek Help Center - Detalhes ------------------- \n");
        Chamado.informacoesChamado(chamado1);
        Logs.exibirLogs(totalLogs,chamado1);
    }
}