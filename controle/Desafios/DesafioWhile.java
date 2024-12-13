package controle.Desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double total = 0;
        int qtdNotas = 0;

        while (nota != -1) {
            System.out.println("Digite uma nota: ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                total += nota;
                qtdNotas += 1;
                System.out.println("Nota digitada: " + nota + "\nSoma das notas: " + total + "\nTotal de notas: " + qtdNotas);

            } else if (nota != -1) {
                System.out.println("Nota inválida, digite uma nota entre 0 e 10.");
            };
        
        };
        
        double media = total / qtdNotas;
        System.out.println("Média: " + media);

        entrada.close();
    }
}
