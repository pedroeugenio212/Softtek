package br.com.softtek;

import br.com.softtek.entity.Analista;
import br.com.softtek.entity.Categoria;
import br.com.softtek.entity.Chamado;
import br.com.softtek.entity.Grupo;
import br.com.softtek.entity.Local;
import br.com.softtek.entity.Logs;
import br.com.softtek.entity.Sintoma;
import br.com.softtek.entity.Tarefa;
import br.com.softtek.entity.Usuario;

// import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
// import java.util.InputMismatchException;
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
    Tarefa tarefa = new Tarefa();
    Usuario usuario1 = new Usuario();
    Usuario usuario2 = new Usuario();

    public void Instanciar() {
        analista1
            .setId(1)
            .setGrupo(grupo1)
            .setNome("Ricardo Almeida Pires")
            .setEmail("teste")
            .setCategoria(null);
        analista2
            .setId(2)
            .setGrupo(grupo2)
            .setNome("Amanda Rocha Nascimento")
            .setEmail("Amanda.Rocha@sofftekHP.com.br")
            .setCategoria(null);
        analista3
            .setId(3)
            .setGrupo(grupo2)
            .setNome("Rafael Pereira")
            .setEmail("Rafael.Pereira@sofftekHP.com.br")
            .setCategoria(null);
        analista4
            .setId(4)
            .setGrupo(grupo1)
            .setNome("Mariana Alves Campos")
            .setEmail("Mariana.Alves@sofftekHP.com.br")
            .setCategoria(null);  
        categoria1
            .setId(1)
            .setSintoma(sintoma1)  
            .setTipo(null)
            .setSubTipo(null);
        categoria2
            .setId(2)
            .setSintoma(sintoma2)  
            .setTipo(null)
            .setSubTipo(null);
        categoria3
            .setId(3)
            .setSintoma(sintoma1)  
            .setTipo(null)
            .setSubTipo(null);

        chamado1
            .setId(1)
            .setChamado(null)
            .setCategoria(categoria1)
            .setGrupo(grupo2)
            .setAnalista(analista2)
            .setUsuario(usuario1)
            .setNumero("67789001")
            .setTipo(null)
            .setStatus(null)
            .setPrioridade(null)
            .setDescricao("Problema referente ao ....")
            .setAbertura(LocalDateTime.of(2024, 7, 21, 10, 42, 36))
            .setUltimaAtualizacao(LocalDateTime.of(2024, 7, 21, 16, 07, 28));
        chamado2
            .setId(2)
            .setChamado(null)
            .setCategoria(categoria2)
            .setGrupo(grupo1)
            .setAnalista(analista4)
            .setUsuario(usuario2)
            .setNumero("67789002")
            .setTipo(null)
            .setStatus(null)
            .setPrioridade(null)
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
        tarefa
            .setId(1)
            .setChamado(chamado1)
            .setAnalista(analista3)
            .setDataAbertura(LocalDateTime.of(2024, 7, 21, 12, 02, 50))
            .setDataEncerramento(null)
            .setNumero("334")
            .setStatus(null)
            .setDescricao("Descrição da tarefa do chamado 1");
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
    }

    public void LoginUsuario() {

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

    public void LoginAnalista() {
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

    public int MenuUsuario() {
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

    public int MenuAnalista() {
        System.out.println("\n Acessando como Analista... \n");
        System.out.println("\n\n ------------------- Bem vindo a Softtek Help Center ------------------- \n");
        // Colocar as opções das funcionalidades de cada acesso aqui
        System.out.println("Selecione uma das opções a seguir: "); 
        System.out.println("1 ---- Funcionalidade 1");
        System.out.println("2 ---- Funcionalidade 2");
        System.out.print("\nDigite: ");
        int op = sc.nextInt();
        return op;
    }

    public void LimparEntradaInvalida()
    {
        if (sc.hasNext())
            sc.next();
    }

    public void visualizarChamados() {
        System.out.println("\n--------------- Chamados Abertos ---------------\n");
        System.out.println("Chamado: \n" + 
        "\nPosição: " + chamado1.getId() +
        "\nChamado: " + chamado1.getChamado() + 
        "\nCategoria: " + chamado1.getCategoria() + 
        "\nGrupo: " + chamado1.getGrupo() +
        "\nAnalista: " + chamado1.getAnalista() +
        "\nUsuario: " + chamado1.getUsuario() + 
        "\nNúmero: " + chamado1.getNumero() + 
        "\nTipo: " + chamado1.getTipo() + 
        "\nStatus: " + chamado1.getStatus() + 
        "\nPrioridade: " + chamado1.getPrioridade() + 
        "\nDescrição: " + chamado1.getDescricao() +
        "\nData de abertura: " + chamado1.getAbertura() +
        "\nÚltima atualização: " + chamado1.getUltimaAtualizacao());
        
        System.out.println("\nPosição: " + chamado2.getId() +
        "\nChamado: " + chamado2.getChamado() + 
        "\nCategoria: " + chamado2.getCategoria() + 
        "\nGrupo: " + chamado2.getGrupo() +
        "\nAnalista: " + chamado2.getAnalista() +
        "\nUsuario: " + chamado2.getUsuario() + 
        "\nNúmero: " + chamado2.getNumero() + 
        "\nTipo: " + chamado2.getTipo() + 
        "\nStatus: " + chamado2.getStatus() + 
        "\nPrioridade: " + chamado2.getPrioridade() + 
        "\nDescrição: " + chamado2.getDescricao() +
        "\nData de abertura: " + chamado2.getAbertura() +
        "\nÚltima atualização: " + chamado2.getUltimaAtualizacao());    
    }

}