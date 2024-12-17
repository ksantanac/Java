package arrays;

import java.util.Arrays;

public class Array02 {

    public static void main(String[] args) {
        
        double[]  notasAlunoA = new double[5];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        };
        
        System.out.println(totalAlunoA / notasAlunoA.length);

        // Notas setadas direto no array literal
        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
        
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        };
        
        System.out.println(totalAlunoB / notasAlunoB.length);
        
        // Acessar ultima nota
        System.out.println(notasAlunoB[notasAlunoB.length - 1]);
    }
}
