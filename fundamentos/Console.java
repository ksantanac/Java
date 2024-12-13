package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!");

        System.out.println();

        System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f%n", 12345.6789);
        System.out.printf("Nome: %s%n", "João");

        // Declarando Scanner para Input do Usuário
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
    }
}
