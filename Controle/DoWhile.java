package Controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        String texto = "";
        do {
            System.out.println("Voce precisa falar as palavras máicas...");
            System.out.println("Deseja sair?");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));
        
        System.out.println("Obrigado!");
        entrada.close();
    }
}
