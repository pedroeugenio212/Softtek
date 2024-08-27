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

        int op;

        System.out.println("\n\n ------------------- Iniciando ------------------- \n");

        System.out.println("\nPara acessar o programa, por favor, selecione a forma de login.\n");
        System.out.println("1 ---- Usuário.");
        System.out.println("2 ---- Analista.");
        System.out.println("0 ---- Sair.");


        try { 
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
                case 0 -> System.err.println("\nFinalizando programa.\n");
                default -> {
                }
            }
        } catch (InputMismatchException e)
        {
            System.out.println("Entrada inválida. Por favor, insira um número.");
            util.limparEntradaInvalida();
            op = -1;
        }

        sc.close();
    
    }
}