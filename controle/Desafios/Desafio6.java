package controle.Desafios;

//6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
//O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
//de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numSecreto = 20;
        int tentativas = 0;
        int qtdTentativas = 10;


        while (tentativas <= 10) {
            System.out.println("Digite um número: ");
            tentativas = entrada.nextInt();

            if (tentativas == numSecreto) {
                System.out.println("Parabens, você acertou!");
                break;
            } else {
                qtdTentativas -= 1;

                if (qtdTentativas == 0) {
                    System.out.println("Número de tentativas excedido!");
                    break;
                };

                System.out.println("Número errado, tenta novamente. Você tem mais " + qtdTentativas + " tentativas.");

            }
        };


    }
}
