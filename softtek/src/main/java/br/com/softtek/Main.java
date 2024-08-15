package br.com.softtek;

import java.util.InputMismatchException;

public class Main
{
    public static void main(String[] args)
    {
        Utilitario util = new Utilitario();
        util.Instanciar();
        int op;

        do
        {
            try
            {   
                util.Login();                
                op = util.TelaMenu();
                switch (op)
                {
                    case 1 -> util.visualizarChamados();
                    case 0 -> System.out.println("\nFinalizando o programa");
                    default -> System.out.println("\nOpção inválida");
                }
            } catch (InputMismatchException e)
            {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                util.LimparEntradaInvalida();
                op = -1;
            }
        } while (op != 0);
        
    }
}
