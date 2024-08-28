package br.com.softtek;
import java.util.Scanner;

import java.util.InputMismatchException;

public class Main
{
    public static void main(String[] args)
    {
        Utilitario util = new Utilitario();
        Scanner sc = new Scanner(System.in);
        
        util.Instanciar();

        int op = -1;

        System.out.println("\n\n ------------------- Iniciando ------------------- \n");

        System.out.println("\nPara acessar o programa, por favor, selecione a forma de login.\n");

        while(op != 0) {
            try {
                System.out.println("1 ---- Usuário.");
                System.out.println("2 ---- Analista.");
                System.out.println("0 ---- Sair.");
                System.out.print("\nInsira uma opção: ");
                op = sc.nextInt();
                switch (op) {
                    case 1 -> {
                        util.loginUsuario();
                        util.menuUsuario();
                    }
                    case 2 -> {
                        util.loginAnalista();
                        util.menuAnalista();
                    }
                    case 0 -> System.out.println("\nFinalizando programa.\n");
                    default -> System.out.println("Opção inválida. Por favor, insira uma opção válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.nextLine();
                op = -1;
            }
        }
        sc.close();
    }
}