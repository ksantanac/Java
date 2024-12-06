package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        var palavra = "";

        while (!palavra.equalsIgnoreCase("Sair")) {

            System.out.println("Digite uma palavra: ");
            palavra = entrada.nextLine();

            System.out.println(palavra);
        };
    }
}
