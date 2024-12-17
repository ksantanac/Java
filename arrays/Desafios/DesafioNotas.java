package arrays.Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioNotas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de notas: ");
        int qtdNotas = entrada.nextInt();
        
        double[] notasAluno = new double[qtdNotas];

        for (int i = 0; i < notasAluno.length; i++) {
            System.out.println("Digite a nota " + i + ": ");
            notasAluno[i] = entrada.nextDouble();
            
            System.out.println(notasAluno[i]);
        };
        
        System.out.println(Arrays.toString(notasAluno));

        int contador = 0;
        double notaSoma = 0;
        for (double nota: notasAluno) {
            contador += 1;
            notaSoma += nota;
            System.out.println("Sua nota " + contador + " é: " + nota);
            System.out.println("Soma: " + notaSoma);
        };

        System.out.println("Média das notas: " + (notaSoma / notasAluno.length));
    }
}
