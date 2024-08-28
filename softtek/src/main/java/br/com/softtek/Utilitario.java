package br.com.softtek;

import br.com.softtek.entity.Analista;
import br.com.softtek.entity.Categoria;
import br.com.softtek.entity.Chamado;
import br.com.softtek.entity.Chamado.Prioridade;
import br.com.softtek.entity.Chamado.Tipo;
import br.com.softtek.entity.Grupo;
import br.com.softtek.entity.Local;
import br.com.softtek.entity.Logs;
import br.com.softtek.entity.Sintoma;
import br.com.softtek.entity.Usuario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

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
    Chamado chamadoUsuario = new Chamado();
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
            .setEmail("ricardo.almeida@softtekhp.com.br")
            .setCategoria(Analista.Categoria.ACESSO);
        analista2
            .setId(2)
            .setGrupo(grupo2)
            .setNome("Amanda Rocha Nascimento")
            .setEmail("amanda.rocha@softtekhp.com.br")
            .setCategoria(Analista.Categoria.AMS);
        analista3
            .setId(3)
            .setGrupo(grupo2)
            .setNome("Rafael Pereira")
            .setEmail("rafael.pereira@softtekhp.com.br")
            .setCategoria(Analista.Categoria.FIELD);
        analista4
            .setId(4)
            .setGrupo(grupo1)
            .setNome("Mariana Alves Campos")
            .setEmail("mariana.alves@softtekhp.com.br")
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
            .setGrupo(grupo1)
            .setAnalista(analista1)
            .setUsuario(usuario1)
            .setNumero("67789001")
            .setTipo(Chamado.Tipo.PROBLEMA)
            .setStatus(Chamado.Status.ABERTO)
            .setPrioridade(Chamado.Prioridade.ALTO)
            .setDescricao("Um servidor de dados em nosso escritório está apresentando dados incoerentes e mal funcionamento, favor verificar com ugêrncia.")
            .setAbertura(LocalDateTime.of(2024, 7, 21, 10, 42, 36))
            .setUltimaAtualizacao(LocalDateTime.of(2024, 7, 21, 16, 07, 28));
        chamado2
            .setId(2)
            .setCategoria(categoria2)
            .setGrupo(grupo2)
            .setAnalista(analista2)
            .setUsuario(usuario2)
            .setNumero("67789002")
            .setTipo(Chamado.Tipo.PROBLEMA)
            .setStatus(Chamado.Status.RESOLVIDO)
            .setPrioridade(Chamado.Prioridade.ALTO)
            .setDescricao("Problema referente ao acesso")
            .setAbertura(LocalDateTime.of(2024, 7, 28, 8, 19, 06))
            .setUltimaAtualizacao(LocalDateTime.of(2024, 7, 11, 13, 16, 57));
        grupo1
            .setId(1)
            .setNome("Suporte ao Usuário");
        grupo2
            .setId(2)
            .setNome("Técnicos de equipamentos");
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
            .setEmail("roberto@softtekhp.com.br")
            .setSenha("123456")
            .setDescricao("Roberto Almeida Santos, é um gerente do departamento de Rh na nossa sede em Monterrey México.")
            .setTelefone("(11) 97879 - 9901");
        usuario2
            .setId(2)
            .setNome("Ana Maria de Souza")
            .setEmail("anams@softtekhp.com.br")
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

        System.out.println("Utilize o e-mail: " + acesso_emailUsuario[0] + " e o senha: " + acesso_senha[0] + " para realizar o acesso.\n");

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
        int acesso_grupo[] = {analista1.getGrupo().getId(), analista2.getGrupo().getId(), analista3.getGrupo().getId(), analista4.getGrupo().getId()};

        System.out.println("\nAcessando como Analista.\n");

        System.out.println("Utilize o e-mail: " + acesso_email[0] + " e o ID: " + acesso_grupo[0] + " para realizar o acesso.\n");

        do {
            System.out.print("Insira o e-mail: ");
            String email = sc.next();
            System.out.print("Insira o ID do seu grupo: ");
            int grupo = sc.nextInt();

            for (int i = 0; i < acesso_email.length; i++) {
                if (email.equals(acesso_email[i]) && grupo == acesso_grupo[i]) {
                    acesso = true;
                    break;
                } else {
                    System.out.println("\nAnalista não encontrado. Tente novamente!\n");
                    break;
                }
            } 
        } while (!acesso);
    }

    public void menuUsuarioOp() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\nSelecione uma das opções a seguir:\n"); 
        System.out.println("1 ---- Novo chamado");
        System.out.println("2 ---- Detalhes dos chamados em aberto");
        System.out.println("3 ---- Detalhes do perfil");
        System.out.println("4 ---- Sair");
    }

    public void menuUsuario() {
        System.out.println("\n\n Acessando como Usuário... \n");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\n------------------- Bem vindo a Softtek Help Center ----------------- \n");
        menuUsuarioOp();
        
        int op;
        
        do {
            try { 
                System.out.print("\nDigite: ");
                op = sc.nextInt();
                switch (op) {
                    case 1 -> {
                        novoChamado();
                        System.out.println("\n");
                        menuUsuarioOp();
                    }
                    case 2 -> {
                        detalhesNovoChamado();
                        System.out.println("\n");
                        menuUsuarioOp();
                    }
                    case 3 -> {
                        exibirPerfil();
                        System.out.println("\n");
                        menuUsuarioOp();
                    }
                    case 4 -> {
                        System.out.println("\nObrigado por utilizar a Softtek Help Center.");
                        System.out.println("\nEncerrando o programa...\n");
                        break;
                    }
                    default -> {
                        System.out.println("\nInsira uma opção válida!\n");
                        menuUsuarioOp();
                    }
                }
            } catch (InputMismatchException e)
            {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.nextLine();
                op = -1;
            }
        } while (op != 4);
    }

    public void menuAnalistaOp() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\nSelecione uma das opções a seguir:\n"); 
        System.out.println("1 ---- Exibir dashboard");
        System.out.println("2 ---- Detalhes dos chamados ativo");
        System.out.println("3 ---- Detalhes do grupo");
        System.out.println("4 ---- Sair");
    }

    public void menuAnalista() {
        System.out.println("\n\n Acessando como Analista... \n");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\n------------------- Bem vindo a Softtek Help Center ----------------- \n");
        menuAnalistaOp();
        
        int op;
        
        do {
            try { 
                System.out.print("\nDigite: ");
                op = sc.nextInt();
                switch (op) {
                    case 1 -> {
                        exibirDashboard();
                        System.out.println("\n");
                        menuAnalistaOp();
                    }
                    case 2 -> {
                        detalhesChamado();
                        System.out.println("\n");
                        menuAnalistaOp();
                    }
                    case 3 -> {
                        exibirGrupo();
                        System.out.println("\n");
                        menuAnalistaOp();
                    }
                    case 4 -> {
                        System.out.println("\nObrigado por utilizar a Softtek Help Center.");
                        System.out.println("\nEncerrando o programa...\n");
                        break;
                    }
                    default -> {
                        System.out.println("\nInsira uma opção válida!\n");
                        menuAnalistaOp();
                    }
                }
            } catch (InputMismatchException e)
            {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.nextLine();
                op = -1;
            }
        } while (op != 4);        
    }

    public void exibirDashboard() {
        System.out.println("\n\n------------------- Softtek Help Center - Dashboard ------------------- \n");
        Chamado.situacaoChamado(totalChamados);
        Chamado.listarChamados(totalChamados);
    }
    
    public void detalhesChamado() {
        System.out.println("\n\n------------------- Softtek Help Center - Detalhes ------------------- \n");
        Chamado.informacoesChamado(chamado1);
        Logs.exibirLogs(totalLogs,chamado1);
    }

    public void novoChamado(){
        Chamado.Tipo tipoSelecionado = null;
        Chamado.Prioridade prioridadeSelecionada = null;
        Categoria.Tipo categoriaSelecionada = null;
        
        System.out.println("\n\n ------------------- Softtek Help Center - Novo Chamado ------------------- \n");
        System.out.println("Preencha o formulário a seguir para abrir seu novo chamado.\n");
       
        
        System.out.println("\nSelecione o Tipo do chamado:");
        for (Tipo tipo : Tipo.values()) {
            System.out.println(tipo.ordinal() + " - " + tipo);
        }
        while (tipoSelecionado == null) {
            System.out.print("\nDigite o número correspondente ao Tipo: ");
            
            try {
                int escolha = sc.nextInt();
                
                if (escolha >= 0 && escolha < Tipo.values().length) {
                    tipoSelecionado = Tipo.values()[escolha];
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } catch(InputMismatchException e){
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.nextLine();
            }
        }
        
        System.out.println("\nSelecione a Prioridade do chamado:");
        for (Prioridade prioridade : Prioridade.values()) {
            System.out.println(prioridade.ordinal() + " - " + prioridade);
        }
        while (prioridadeSelecionada == null) {
            System.out.print("\nDigite o número correspondente a Prioridade: ");
            
            try {
                int escolha = sc.nextInt();
            
                if (escolha >= 0 && escolha < Prioridade.values().length) {
                    prioridadeSelecionada = Prioridade.values()[escolha];
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } catch(InputMismatchException e){
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.nextLine();
            }
        }
        
        System.out.println("\nSelecione a Categoria do chamado:");
        for (Categoria.Tipo categoria : Categoria.Tipo.values()) {
            System.out.println(categoria.ordinal() + " - " + categoria);
        }
        while (categoriaSelecionada == null) {
            System.out.print("\nDigite o número correspondente a Categoria: ");
            
            try {
                int escolha = sc.nextInt();
            
                if (escolha >= 0 && escolha < Categoria.Tipo.values().length) {
                    categoriaSelecionada = Categoria.Tipo.values()[escolha];
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } catch(InputMismatchException e){
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.nextLine();
            }
        }
        
        System.out.println("\nSelecione o Grupo a qual o chamado pertence:");
        System.out.println("(1) " + grupo1.getNome() + " / (2) " + grupo2.getNome());
        System.out.println("\nDigite o número correspondente ao Grupo: ");
        switch(sc.nextInt()){
            case 1 -> chamadoUsuario.setGrupo(grupo1);
            case 2 -> chamadoUsuario.setGrupo(grupo2);
            default -> System.out.println("Opção inválida. Por favor, insira uma opção válida.");
        }
        sc.nextLine();
        
        System.out.println("\nInsira a descrição do chamado: ");
        chamadoUsuario.setDescricao(sc.nextLine());
        
        chamadoUsuario.setId(3)
            .setNumero("67789003")
            .setUsuario(usuario1)
            .setUltimaAtualizacao(LocalDateTime.now())
            .setAbertura(LocalDateTime.now())
            .setTipo(tipoSelecionado)
            .setStatus(Chamado.Status.ABERTO)
            .setPrioridade(prioridadeSelecionada)
            .getCategoria().setTipo(categoriaSelecionada);
        
        System.out.print("\nChamado aberto com sucesso!");
    }

    public void detalhesNovoChamado(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy, HH:mm", new Locale("pt", "BR"));
        System.out.println("\n\n ------------------- Softtek Help Center - Detalhes sobre o novo chamado ------------------- \n");
        
        if(chamadoUsuario.getId() == 3) {
            System.out.println("\nOlá " + usuario1.getNome() + ",\n\nNo momento o chamado que você abriu recentemente está aguardando a verificação de um analista!");
            System.out.println("\nAcompanhe os detalhes:\nNúmero do chamado: " + chamadoUsuario.getNumero() +
            "\nCategoria: " + chamadoUsuario.getCategoria().getTipo().toString() +
            "\nTipo: " + chamadoUsuario.getTipo().toString() +
            "\nStatus: " + chamadoUsuario.getStatus().toString() +
            "\nPrioridade: " + chamadoUsuario.getPrioridade().toString() +
            "\nGrupo responsável: " + chamadoUsuario.getGrupo().getNome() +
            "\nAnalista responsável: " + (chamadoUsuario.getAnalista().getNome() != null ? chamadoUsuario.getAnalista().getNome() : "Nenhum") +
            "\nData / Hora da abertura: " + chamadoUsuario.getAbertura().format(formatter) +
            "\nDescrição: " + chamadoUsuario.getDescricao());
        } else {
            System.out.println("\nNenhum chamado aberto no momento!");
        }
    
    }

    public void exibirGrupo() {
        System.out.println("\n\n ------------------- Softtek Help Center - Grupo & Categoria ------------------- \n");
        System.out.println("Olá " + analista1.getNome() + ",\n\nNo momento você está atribuido ao grupo: " + analista1.getGrupo().getNome() + ", & na categoria: " + analista1.getCategoria() + ",\n\nQualquer dúvida entre em contato com seu supervisor.");
    }

    public void exibirPerfil() {
        System.out.println("\n\n ------------------- Softtek Help Center - Perfil ------------------- \n");
        System.out.println("Olá " + usuario1.getNome() + 
        ",\n\nConfira os detalhes do seu perfil:\n\nNome: " + usuario1.getNome() + 
        "\nEmail: " + usuario1.getEmail() +
        "\nSenha: " + usuario1.getSenha() + 
        "\nDescrição: " + usuario1.getDescricao() +
        "\nTelefone:" + usuario1.getTelefone());  
    }
}