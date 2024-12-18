package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CojuntoComportado {

    public static void main(String[] args) {

        // Lista obrigatorio String
        // Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>(); // Aceita ordenação
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");
        
        for (String candidato: lista) {
            System.out.println(candidato);
        };

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        
        for (int numeros: nums) {
            System.out.println(numeros);
        };
    }
}
